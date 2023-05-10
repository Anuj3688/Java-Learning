package com.jspider.SpringCoreMixedConfiguration.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PatientBean {

	@Value("1011")
	private int id;

	@Value("ROCKY BHAI")
	private String name;

	@Value("KGF")
	private String address;
}
