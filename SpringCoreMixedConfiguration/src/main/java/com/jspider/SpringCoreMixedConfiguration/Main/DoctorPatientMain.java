package com.jspider.SpringCoreMixedConfiguration.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.SpringCoreMixedConfiguration.Bean.DoctorBean;

public class DoctorPatientMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("doctor.xml");
		DoctorBean doctor = (DoctorBean) ctx.getBean(DoctorBean.class);
		System.out.println(doctor);

		((ClassPathXmlApplicationContext) ctx).close();
	}
}