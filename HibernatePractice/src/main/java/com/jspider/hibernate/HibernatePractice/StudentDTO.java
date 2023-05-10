package com.jspider.hibernate.HibernatePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class StudentDTO {

	@Id
	private int rollno;

	private String name;

	private String email;

	private long phone;

	private String address;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentsDto [rollno=" + rollno + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}
