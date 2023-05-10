package com.jspider.DependencyInjection.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.DependencyInjection.Bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		Employee bean = (Employee) context.getBean("employee");
		System.out.println(bean);

		((ClassPathXmlApplicationContext) context).close();
	}
}
