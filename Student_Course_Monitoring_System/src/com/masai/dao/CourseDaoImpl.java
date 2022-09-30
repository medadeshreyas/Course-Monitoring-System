/**
 * 
 */
package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Course;
import com.masai.exceptions.CourseException;
import com.masai.utility.DatabaseUtility;

/**
 
 *
 */
public class CourseDaoImpl implements CourseDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String createCourse(Course course) {

		String result = null;

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO COURSE(course_name,course_fee,course_desc) VALUES (?,?,?)");

			statement.setString(1, course.getCourse_name());
			statement.setInt(2, course.getCourse_fee());
			statement.setString(3, course.getCourse_description());

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Course Added Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	public String deleteCourse(int course_id) {

		String result = "Course_Id Does Not Exist! ";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("DELETE FROM COURSE WHERE course_id = ?");

			statement.setInt(1, course_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Course Deleted Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public List<Course> viewCourse() throws CourseException {

		List<Course> list_of_courses = new ArrayList<Course>();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM COURSE");

			ResultSet result = statement.executeQuery();

			while (result.next()) {

				int course_id = result.getInt("course_id");

				String course_name = result.getString("course_name");

				int course_fee = result.getInt("course_fee");

				String course_desc = result.getString("course_desc");

				Course course = new Course(course_id, course_name, course_desc, course_fee);

				list_of_courses.add(course);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new CourseException(e.getMessage());
		}

		if (list_of_courses.size() == 0) {
			System.out.println("No Courses Found in the DataBase");
		}

		return list_of_courses;
	}

}
