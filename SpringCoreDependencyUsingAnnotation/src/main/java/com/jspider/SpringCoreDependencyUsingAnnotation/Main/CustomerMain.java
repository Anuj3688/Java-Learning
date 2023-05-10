package com.jspider.SpringCoreDependencyUsingAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.SpringCoreDependencyUsingAnnotation.Bean.CustomerBean;
import com.jspider.SpringCoreDependencyUsingAnnotation.Config.CustomerConfig;

public class CustomerMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerBean cust = (CustomerBean) ctx.getBean("customer");
		System.out.println(cust);

		((AnnotationConfigApplicationContext) ctx).close();
	}
}
