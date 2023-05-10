package com.jspider.jdbc.jdbcimplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {
	static Connection connection;
	static Statement statement;
	static ResultSet resultSet;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 1st Way using dburl , username, password in the same string

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wejm3?user=root&password=root");
			String query = "select * from emp where emp_no ='11'";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "  -  " + resultSet.getString(2) + "  |  "
						+ resultSet.getString(3) + "  |  " + resultSet.getString(4) + "  |  ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
