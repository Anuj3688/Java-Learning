package com.jspider.SpringCoreDependencyUsingAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jspider.SpringCoreDependencyUsingAnnotation.Bean.EmployeeBean;

@Configuration
@ComponentScan({ "com.jspider.SpringCoreDependencyUsingAnnotation" })
public class EmployeeConfig {

	@Bean("employee")
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}
}
