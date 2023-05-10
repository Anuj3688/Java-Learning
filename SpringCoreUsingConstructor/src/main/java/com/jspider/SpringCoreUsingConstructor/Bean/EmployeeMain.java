package com.jspider.SpringCoreUsingConstructor.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/SpringCoreUsingConstructor/Bean/Employee.xml");
		EmployeeBean bean = (EmployeeBean) ctx.getBean(EmployeeBean.class);
		System.out.println(bean);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
