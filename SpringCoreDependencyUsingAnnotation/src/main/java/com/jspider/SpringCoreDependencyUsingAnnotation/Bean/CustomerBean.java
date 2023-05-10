package com.jspider.SpringCoreDependencyUsingAnnotation.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerBean {

	@Value("111")
	private int id;

	@Value("Pankaj")
	private String name;

	@Autowired
	private CustomerDetailsBean details;
}
