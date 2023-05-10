package com.jspider.SpringCoreDependencyUsingAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.SpringCoreDependencyUsingAnnotation.Bean.EmployeeBean;
import com.jspider.SpringCoreDependencyUsingAnnotation.Config.EmployeeConfig;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean emp = (EmployeeBean) ctx.getBean("employee");
		System.out.println(emp);

		((AnnotationConfigApplicationContext) ctx).close();
	}
}