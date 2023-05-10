package com.jspider.practice2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHotel {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/practice2/springconfig.xml");
		Hotel h = (Hotel) ctx.getBean("hotel");
		System.out.println();
		System.out.println(h);
	}
}
