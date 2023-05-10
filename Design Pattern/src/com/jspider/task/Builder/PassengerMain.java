package com.jspider.task.Builder;

public class PassengerMain {

	public static void main(String[] args) {

		Passenger passenger = new PassengerBuilder().fname("Ganesh").lname("Dhore").fingerprint(true).build();
		System.out.println(passenger);
	}

}
