package com.jspider.builder;

public class MobileMain {

	public static void main(String[] args) {

		Mobile mobile = new MobileBuilder().model("M31").brand("Samsung").price(15000.0).build();
		System.out.println(mobile);
	}

}
