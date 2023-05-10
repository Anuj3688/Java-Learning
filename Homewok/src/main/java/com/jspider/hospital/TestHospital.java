package com.jspider.hospital;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/hospital/hos.xml");
		Hospital h = (Hospital) ctx.getBean("hospital");
		System.out.println();
		System.out.println(h);
	}
}
