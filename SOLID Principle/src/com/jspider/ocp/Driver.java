package com.jspider.ocp;

public class Driver {
	public static void main(String[] args) {

		DiscountCheck dc = new DiscountCheck();

		Customer c1 = new CarLoan();
		double fp1 = dc.calcutor(c1);
		System.out.println("discount after loyality " + fp1);

		Customer c2 = new HomeLoan();
		double fp2 = dc.calcutor(c2);
		System.out.println("discount after loyality " + fp2);

		Customer c3 = new GoldLoan();
		double fp3 = dc.calcutor(c2);
		System.out.println("discount after loyality " + fp3);

	}

}