package com.jspider.practice1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/practice1/springconfig.xml");
		Student s = (Student) ctx.getBean("student");
		System.out.println();
		System.out.println(s);
	}

}
