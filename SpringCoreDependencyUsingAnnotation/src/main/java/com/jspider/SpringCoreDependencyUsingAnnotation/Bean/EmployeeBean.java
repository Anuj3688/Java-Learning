package com.jspider.SpringCoreDependencyUsingAnnotation.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmployeeBean {

	@Value("101")
	private int id;

	@Value("PANKAJ")
	private String name;

	@Autowired
	private EmployeeDetailsBean details;
}
