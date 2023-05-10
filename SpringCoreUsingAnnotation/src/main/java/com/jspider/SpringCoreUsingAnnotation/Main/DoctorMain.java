package com.jspider.SpringCoreUsingAnnotation.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.SpringCoreUsingAnnotation.Bean.DoctorBean;
import com.jspider.SpringCoreUsingAnnotation.Config.DoctorConfig;

public class DoctorMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(DoctorConfig.class);
		DoctorBean doctor = (DoctorBean) ctx.getBean("doctor");
		doctor.setId(1);
		doctor.setName("AMOL");
		doctor.setSpl("M D");
		System.out.println(doctor);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
