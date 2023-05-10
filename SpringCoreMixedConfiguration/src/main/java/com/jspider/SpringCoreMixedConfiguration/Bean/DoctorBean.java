package com.jspider.SpringCoreMixedConfiguration.Bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class DoctorBean {

	private int id;

	private String name;

	private String specialization;

	@Autowired
	private PatientBean patient;
}