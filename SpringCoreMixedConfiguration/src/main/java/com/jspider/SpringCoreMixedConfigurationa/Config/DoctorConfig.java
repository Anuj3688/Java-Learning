package com.jspider.SpringCoreMixedConfigurationa.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jspider.SpringCoreMixedConfiguration.Bean.DoctorBean;

@Configuration
@ComponentScan(basePackages = { "com.jspider.SpringCoreMixedConfiguration" })
public class DoctorConfig {

	@Bean("doctor")
	public DoctorBean getDoctor() {
		return new DoctorBean();
	}

}
