package com.Factory;

import java.util.Scanner;

public class BrowserDriver {

	static int choice;
	static Scanner sc = new Scanner(System.in);
	static Browser browser;

	public static void main(String[] args) {

		try {
			factory().select();

		} catch (NullPointerException e) {
			System.out.println("Nothing selected");
		}
	}

	public static Browser factory() {

		System.out.println(" choose your Browser  .\n1.chrome\n2.Firefox. \n3.Safari \n4.Edge \n5.Opera  ");

		choice = sc.nextInt();
		switch (choice) {
		case 1:
			browser = new Chrome();
			return browser;

		case 2:
			browser = new Edge();
			return browser;

		case 3:
			browser = new Firefox();
			return browser;

		case 4:
			browser = new Opera();
			return browser;

		case 5:
			browser = new Safari();
			return browser;

		default:
			System.out.println(" Invalid Browser");
			break;

		}

		return browser;

	}
}
