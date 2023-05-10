package com.jspider.practice2;

public class Hotel {

	private String name;
	private String no_of_emp;
	private String address;
	private String no_of_table;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo_of_emp() {
		return no_of_emp;
	}

	public void setNo_of_emp(String no_of_emp) {
		this.no_of_emp = no_of_emp;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNo_of_table() {
		return no_of_table;
	}

	public void setNo_of_table(String no_of_table) {
		this.no_of_table = no_of_table;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", no_of_emp=" + no_of_emp + ", address=" + address + ", no_of_table="
				+ no_of_table + "]";
	}

}
