package com.jspider.serialization_and_deserialization;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	String number;
	String location;
	public Student(String name, String number, String location) {
		super();
		this.name = name;
		this.number = number;
		this.location = location;
	}
}
