package com.jspider.jdbc.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CarObject {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties = new Properties();
	private static List<Car> carList = new ArrayList<>();

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			fileReader = new FileReader("C:\\Users\\Ganesh\\eclipse-workspace\\JDBC\\resources\\car.properties");
			properties = new Properties();
			properties.load(fileReader);
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties.getProperty("user"),
					properties.getProperty("password"));
			statement = connection.createStatement();
			resultSet = statement.executeQuery(properties.getProperty("query"));
			while (resultSet.next()) {
				Car car = new Car();
				car.setCarName(resultSet.getString(1));
				car.setCarId(resultSet.getString(2));
				car.setCarColor(resultSet.getString(3));
				car.setCarType(resultSet.getString(4));
				carList.add(car);

			}
			for (Car c : carList) {
				System.out.println(c);
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
