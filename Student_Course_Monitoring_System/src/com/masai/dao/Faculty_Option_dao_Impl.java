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

public class Faculty_Option_dao_Impl implements FacultyOptionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Faculty loginFaculty(String username, String password) throws FacultyException {

		Faculty faculty = null;

		try (Connection conn = DatabaseUtility.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM FACULTY WHERE faculty_user = ? AND faculty_password = ? ");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int r = rs.getInt("faculty_id");
				String n = rs.getString("faculty_name");
				String m = rs.getString("faculty_address");
				String e = rs.getString("faculty_mobile");
				String p = rs.getString("faculty_email");
				String u = rs.getString("faculty_user");
				String v = rs.getString("faculty_password");
				faculty = new Faculty();
				faculty.setFaculty_Id(r);
				faculty.setFaculty_Name(n);
				faculty.setFaculty_Address(m);
				faculty.setFaculty_Mobile(e);
				faculty.setFaculty_Email(p);
				faculty.setFaculty_User(u);
				faculty.setFaculty_Password(v);

			} else
				throw new FacultyException("Invalid Username or password.. ");

		} catch (SQLException e) {
			throw new FacultyException(e.getMessage());
		}

		if (faculty != null) {
			System.out.println("Login Successfull !");
		}

		return faculty;
	}

	@Override
	public List<Course_Plan> viewCoursePlan(int faculty_id) throws Course_PlanException {
		List<Course_Plan> list_of_CoursePlan = new ArrayList<Course_Plan>();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("select * from course_plan where faculty_id=?  order by batch_id,day ");

			statement.setInt(1, faculty_id);
			ResultSet result = statement.executeQuery();

			while (result.next()) {

				String plan_id = result.getString("plan_id");

				String batch_id = result.getString("batch_id");

				int faculty_id1 = result.getInt("faculty_id");

				Date day = result.getDate("day");

				String topic = result.getString("topic");

				boolean status = result.getBoolean("status");

				Course_Plan Course_Plan = new Course_Plan(plan_id, batch_id, faculty_id1, day, topic, status);

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

	@Override
	public String update_daywise_schedule(String plan_id, String batch_id, int faculty_id, Date day, String topic,
			boolean status) throws Course_PlanException {
		String result = "Plan ID   Does Not Exist! ";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement(
					"UPDATE course_plan SET day=?,topic =?,status=? WHERE plan_id=? AND batch_id =? AND faculty_id=?");

			statement.setDate(1, day);
			statement.setString(2, topic);
			statement.setBoolean(3, status);
			statement.setString(4, plan_id);
			statement.setString(5, batch_id);
			statement.setInt(6, faculty_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Day Wise Schedule Updated Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public String changePassword(int active_faculty_id, String new_faculty_password) throws FacultyException {
		String result = "Incorrect User_id";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("UPDATE faculty SET faculty_password=? WHERE faculty_id=?");

			statement.setString(1, new_faculty_password);
			statement.setInt(2, active_faculty_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Password Updated Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;

	}
}
