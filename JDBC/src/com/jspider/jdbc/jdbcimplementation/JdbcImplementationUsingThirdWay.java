package com.jspider.jdbc.jdbcimplementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcImplementationUsingThirdWay {

	private static Connection connection;
	private static FileReader fileReader;
	private static Statement statement;
	private static Properties properties;
	private static ResultSet resultSet;
	// private static String query;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader = new FileReader("C:\\Users\\Ganesh\\eclipse-workspace\\JDBC\\resources\\students.properties");
			properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));
			statement = connection.createStatement();
			// query="select * from students";
			resultSet = statement.executeQuery(properties.getProperty("query"));
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));
				System.out.println("------------------------------");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null && statement != null && resultSet != null) {
				try {
					connection.close();
					statement.close();
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
