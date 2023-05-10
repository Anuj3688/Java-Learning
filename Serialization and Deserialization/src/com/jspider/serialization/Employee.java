package com.jspider.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	String name,mail;

	public Employee(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	
}
