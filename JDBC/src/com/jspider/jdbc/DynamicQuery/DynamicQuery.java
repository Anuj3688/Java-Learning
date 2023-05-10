package com.jspider.jdbc.DynamicQuery;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DynamicQuery {

	private static Connection connection;
	private static FileReader fileReader;
	private static Properties properties;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			fileReader = new FileReader("C:\\Users\\Ganesh\\eclipse-workspace\\JDBC\\resources\\students.properties");
			properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));

			resultSet = preparedStatement.executeQuery();
			preparedStatement = connection.prepareStatement(properties.getProperty("query"));

			System.out.println("Please enter number ");
			preparedStatement.setInt(1, sc.nextInt());

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
				System.out.println(resultSet.getString(5));
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null && preparedStatement != null && resultSet != null && sc != null) {
				try {
					connection.close();
					preparedStatement.close();
					resultSet.close();
					sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
