package com.jspider.SpringCoreDependencyUsingAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspider.SpringCoreDependencyUsingAnnotation.Bean.CustomerBean;

@ComponentScan({ "com.jspider.SpringCoreDependencyUsingAnnotation" })
public class CustomerConfig {

	@Bean("customer")
	public CustomerBean getCustomer() {
		return new CustomerBean();
	}
}
