package com.jspider.factoryMethod;

import java.util.Scanner;

public class FastFoodDriver {

	static int choice;
	static Scanner scanner = new Scanner(System.in);
	static FastFoods fastFoods;

	public static void main(String[] args) {

		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("Nothing Ordered ");
		}
	}

	private static FastFoods factory() {
		System.out.println("Choose Menu \n1.Momo \n2.PaniPuri \n3.Pizza \n4.Pasta \n5.Fries ");
		choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			fastFoods = new Momo();
			return fastFoods;
		}

		case 2: {
			fastFoods = new PaniPuri();
			return fastFoods;
		}

		case 3: {
			fastFoods = new Pizza();
			return fastFoods;
		}

		case 4: {
			fastFoods = new Pasta();
			return fastFoods;
		}

		case 5: {
			fastFoods = new Fries();
			return fastFoods;
		}
		default:
			System.out.println("Invalid Choice ");
		}
		return fastFoods;
	}
}
