package com.jspider.SpringCoreUsingAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jspider.SpringCoreUsingAnnotation.Bean.DoctorBean;

@Configuration
@ComponentScan(basePackages = ("com.jspider.SpringCoreUsingAnnotation"))
public class DoctorConfig {

	@Bean("doctor")
	public DoctorBean doctor() {
		return new DoctorBean();
	}

}
