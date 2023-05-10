package com.jspider.practice1;

public class Student {
	private String name;
	private String rollmo;
	private String division;
	private String standard;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollmo() {
		return rollmo;
	}

	public void setRollmo(String rollmo) {
		this.rollmo = rollmo;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollmo=" + rollmo + ", division=" + division + ", standard=" + standard
				+ ", address=" + address + "]";
	}

}
