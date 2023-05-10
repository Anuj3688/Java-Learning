package com.jspider.spring.Bank;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/spring/Bank/springconfig.xml");
		Bank b = (Bank) ctx.getBean("bank");
		System.out.println(b);
	}
}
