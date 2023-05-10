package com.jspider.practice.P1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBank {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/practice/P1/Bank.xml");
	}

}
