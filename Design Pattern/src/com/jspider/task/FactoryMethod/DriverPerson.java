package com.jspider.task.FactoryMethod;

import java.util.Scanner;

public class DriverPerson {

	static int choice;
	static Scanner scanner = new Scanner(System.in);
	static Person person;

	public static void main(String[] args) {

		try {
			number().create();
		} catch (NullPointerException e) {
			System.out.println("No One Present ");
		}
	}

	private static Person number() {
		System.out.println("Choose Which Number You Want To Genrate \n1.License \n2.Aadhar \n3.PAN \n4.RationBook ");
		choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			person = new License();
			return person;
		}

		case 2: {
			person = new Aadhar();
			return person;
		}

		case 3: {
			person = new PAN();
			return person;
		}

		case 4: {
			person = new RationBook();
			return person;
		}

		default:
			System.out.println("Invalid Choice ");
		}
		return person;
	}
}