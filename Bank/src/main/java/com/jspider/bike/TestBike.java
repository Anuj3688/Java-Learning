package com.jspider.bike;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/bike/springconfig.xml");
		Bike b = (Bike) ctx.getBean("bike");
		System.out.println(b);
	}
}
