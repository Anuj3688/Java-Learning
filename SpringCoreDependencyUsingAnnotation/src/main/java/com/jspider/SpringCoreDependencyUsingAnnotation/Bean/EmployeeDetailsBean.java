package com.jspider.SpringCoreDependencyUsingAnnotation.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmployeeDetailsBean {

	@Value("raju@gmail.com")
	private String email;

	@Value("500000.00")
	private double salary;

	@Value("KARAD")
	private String address;
}