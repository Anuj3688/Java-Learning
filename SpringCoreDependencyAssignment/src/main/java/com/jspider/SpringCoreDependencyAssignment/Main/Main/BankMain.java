package com.jspider.SpringCoreDependencyAssignment.Main.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bank.xml");
		Bank bean = (Bank) ctx.getBean("bank");
		System.out.println(bean);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
