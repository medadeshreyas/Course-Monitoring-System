package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import com.masai.bean.Batch;
import com.masai.bean.Faculty;
import com.masai.exceptions.BatchException;
import com.masai.exceptions.FacultyException;
import com.masai.utility.DatabaseUtility;

public class BatchDaoImpl implements BatchDao {

	@Override
	public String createBatch(Batch batch) {
		// TODO Auto-generated method stub
		String result = null;

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("INSERT INTO Batch VALUES(?,?,?,?,?,?)");

			statement.setString(1, batch.getBatch_Id().toUpperCase());
			statement.setInt(2, batch.getCourse_Id());
			statement.setInt(3, batch.getFaculty_Id());
			statement.setInt(4, batch.getNo_of_Students());
			statement.setDate(5, batch.getBatch_Start_Date());
			statement.setString(6, batch.getDuration());

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
	public String deleteBatch(String batch_id) {

		String result = "Faculty_Id Does Not Exist! ";

		String new_batch_id = batch_id.toUpperCase();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("DELETE FROM BATCH WHERE batch_id = ?");

			statement.setString(1, new_batch_id);

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
	public List<Batch> viewBatch() throws BatchException {
		List<Batch> list_of_batch = new ArrayList<Batch>();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection.prepareStatement("SELECT * FROM Batch");

			ResultSet result = statement.executeQuery();

			while (result.next()) {

				String batch_id = result.getString("batch_id");

				int course_id = result.getInt("course_id");

				int faculty_id = result.getInt("faculty_id");

				int no_of_students = result.getInt("no_of_students");

				Date batch_Start_Date = result.getDate("batch_Start_Date");

				String duration = result.getString("duration");

				Batch batch = new Batch(batch_id, course_id, faculty_id, no_of_students, batch_Start_Date, duration);

				list_of_batch.add(batch);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BatchException(e.getMessage());
		}

		if (list_of_batch.size() == 0) {
			System.out.println("No Batches Found in the DataBase");
		}

		return list_of_batch;
	}

	@Override
	public String updateBatch(String batch_id, int no_of_students) {
		String result = "Batch_ID  Does Not Exist! ";

		String new_batch_id = batch_id.toUpperCase();

		try (Connection connection = DatabaseUtility.provideConnection()) {

			PreparedStatement statement = connection
					.prepareStatement("UPDATE BATCH SET no_of_students=? WHERE batch_id=?;");

			statement.setInt(1, no_of_students);
			statement.setString(2, batch_id);

			int response = statement.executeUpdate();

			if (response > 0) {
				result = "Batch Updated Successfully !";
			}

		} catch (SQLException e) {

			result = e.getMessage();
		}

		return result;
	}

}
