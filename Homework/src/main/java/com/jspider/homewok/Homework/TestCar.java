package com.jspider.homewok.Homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/homewok/Homework/springconfig.xml");
		Car c = (Car) ctx.getBean("car");
		System.out.println(c);
	}
}
