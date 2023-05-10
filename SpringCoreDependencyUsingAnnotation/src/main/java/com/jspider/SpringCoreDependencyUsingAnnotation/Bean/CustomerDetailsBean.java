package com.jspider.SpringCoreDependencyUsingAnnotation.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerDetailsBean {

	@Value("9999988888")
	private long contact;

	@Value("500000")
	private double salary;

	@Value("KARAD")
	private String address;
}
