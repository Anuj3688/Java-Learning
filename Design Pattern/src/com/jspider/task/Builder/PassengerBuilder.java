package com.jspider.task.Builder;

public class PassengerBuilder {

	String fname;
	String lname;
	int age;
	String dob;
	String email;
	String add;
	boolean fingerprint;

	public PassengerBuilder fname(String fname) {
		this.fname = fname;
		return this;
	}

	public PassengerBuilder lname(String lname) {
		this.lname = lname;
		return this;
	}

	public PassengerBuilder age(int age) {
		this.age = age;
		return this;
	}

	public PassengerBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}

	public PassengerBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PassengerBuilder add(String add) {
		this.add = add;
		return this;
	}

	public PassengerBuilder fingerprint(boolean fingerprint) {
		this.fingerprint = fingerprint;
		return this;
	}

	public Passenger build() {
		Passenger passenger = new Passenger(this.fname, this.lname, this.age, this.dob, this.email, this.add,
				this.fingerprint);
		return passenger;
	}
}
