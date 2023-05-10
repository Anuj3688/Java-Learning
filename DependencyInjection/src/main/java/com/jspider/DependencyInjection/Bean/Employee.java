package com.jspider.DependencyInjection.Bean;

import lombok.Data;

@Data
public class Employee {

	private int id;

	private String name;

	private EmployeeDetails details;
}
