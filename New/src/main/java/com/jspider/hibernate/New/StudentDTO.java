package com.jspider.hibernate.New;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDTO {
	@Id
	private int rollNo;
	private String name;
	private String emailId;
	private long phoneNo;
	private String address;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDTO [rollNo=" + rollNo + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}

}
