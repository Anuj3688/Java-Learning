package com.jspider.task.Builder;

public class Passenger {

	String fname;
	String lname;
	int age;
	String dob;
	String email;
	String add;
	boolean fingerprint;

	public Passenger(String fname, String lname, int age, String dob, String email, String add, boolean fingerprint) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.add = add;
		this.fingerprint = fingerprint;
	}

	@Override
	public String toString() {
		return "Passenger [\n fname=" + fname + ",\n lname=" + lname + ",\n age=" + age + ",\n dob=" + dob
				+ ",\n email=" + email + ",\n add=" + add + ",\n fingerprint=" + fingerprint + "]";
	}

}
