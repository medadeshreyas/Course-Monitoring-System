package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Course_Plan;
import com.masai.bean.Faculty;
import com.masai.exceptions.Course_PlanException;
import com.masai.exceptions.FacultyException;
import com.masai.utility.DatabaseUtility;

public class Course_PlanImpl implements Course_Plan_Dao {

	@Override
	public String createCoursePlan(Course_Plan course_plan) {
		String result = null;

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement(
					" INSERT INTO course_plan(plan_id,batch_id) VALUES(?,?)");

			statement.setString(1, course_plan.getPlan_id().toUpperCase());
			statement.setString(2, course_plan.getBatch_id().toUpperCase());
		
			

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Course_plan Added Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public String deleteCoursePlan(String Plan_id,String Batch_id) {
		String result = "Plan_Id Does Not Exist! ";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("DELETE FROM course_plan WHERE plan_id = ? AND batch_id = ?");

			statement.setString(1, Plan_id);
			statement.setString(2, Batch_id);
			int response = statement.executeUpdate();

			if (response > 0) {
				result = "CoursePlan Deleted Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public List<Course_Plan> viewCoursePlan() throws Course_PlanException {
		List<Course_Plan> list_of_CoursePlan = new ArrayList<Course_Plan>();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("select * from course_plan  order by batch_id,day ");

			ResultSet result = statement.executeQuery();

			while (result.next()) {

				String plan_id = result.getString("plan_id");

				String batch_id = result.getString("batch_id");

				Date day = result.getDate("day");

				String topic = result.getString("topic");

				boolean status = result.getBoolean("status");

				

				Course_Plan Course_Plan =new Course_Plan(plan_id, batch_id, day, topic, status);

				list_of_CoursePlan.add(Course_Plan);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new Course_PlanException(e.getMessage());
		}

		if (list_of_CoursePlan.size() == 0) {
			System.out.println("No Course_Plan Found in the DataBase");
		}

		return list_of_CoursePlan;
	}

}
