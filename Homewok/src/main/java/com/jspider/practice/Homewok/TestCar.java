package com.jspider.practice.Homewok;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/practice/Homewok/springconfig.xml");
		Car c = (Car) ctx.getBean("car");
		System.out.println();
		System.out.println(c);
	}
}
