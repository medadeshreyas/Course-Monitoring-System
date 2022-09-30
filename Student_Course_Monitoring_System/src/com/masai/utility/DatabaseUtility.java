/**
 * 
 */
package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class DatabaseUtility {

	public static Connection provideConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/student_course_monitoring_system";

		try {
			connection = DriverManager.getConnection(url, "root", "Zeus@2003");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}
