package com.jspider.SpringCoreUsingAnnotation.Bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DoctorBean {

	private int id;

	private String name;

	private String spl;
}
