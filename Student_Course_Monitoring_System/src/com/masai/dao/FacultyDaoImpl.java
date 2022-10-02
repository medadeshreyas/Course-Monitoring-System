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
import com.masai.bean.Faculty;
import com.masai.exceptions.CourseException;
import com.masai.exceptions.FacultyException;
import com.masai.utility.DatabaseUtility;

/**
 
 *
 */
public class FacultyDaoImpl implements FacultyDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String createFaculty(Faculty faculty) {

		String result = null;

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO FACULTY(faculty_name,faculty_address,faculty_mobile,faculty_email,faculty_user,faculty_password) VALUES (?,?,?,?,?,?)");

			statement.setString(1, faculty.getFaculty_Name());
			statement.setString(2, faculty.getFaculty_Address());
			statement.setString(3, faculty.getFaculty_Mobile());
			statement.setString(4, faculty.getFaculty_Email());
			statement.setString(5, faculty.getFaculty_User());
			statement.setString(6, faculty.getFaculty_Password());

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Faculty Added Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public String deleteFaculty(int faculty_id) {

		String result = "Faculty_Id Does Not Exist! ";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("DELETE FROM FACULTY WHERE faculty_id = ?");

			statement.setInt(1, faculty_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Faculty Deleted Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

	@Override
	public List<Faculty> viewFaculty() throws FacultyException {

		List<Faculty> list_of_faculties = new ArrayList<Faculty>();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM FACULTY");

			ResultSet result = statement.executeQuery();

			while (result.next()) {

				int faculty_id = result.getInt("faculty_id");

				String faculty_name = result.getString("faculty_name");

				String faculty_address = result.getString("faculty_address");

				String faculty_mobile = result.getString("faculty_mobile");

				String faculty_email = result.getString("faculty_email");

				String faculty_user = result.getString("faculty_user");

				String faculty_password = result.getString("faculty_password");

				Faculty faculty = new Faculty(faculty_id, faculty_name, faculty_address, faculty_mobile, faculty_email,
						faculty_user, faculty_password);

				list_of_faculties.add(faculty);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new FacultyException(e.getMessage());
		}

		if (list_of_faculties.size() == 0) {
			System.out.println("No Courses Found in the DataBase");
		}

		return list_of_faculties;

	}

	@Override
	public String updateFaculty(int faculty_id, String faculty_name) {
		String result = "Faculty_ID  Does Not Exist! ";

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("UPDATE faculty SET faculty_name=? WHERE faculty_id=?");

			statement.setString(1, faculty_name);
			statement.setInt(2, faculty_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Faculty Name Updated Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

}
