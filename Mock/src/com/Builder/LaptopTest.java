package com.Builder;

public class LaptopTest {

	public static void main(String[] args) {

		Laptop laptop = new LaptopBuilder().setbrand("hp").setram("2").setrom("1").setdisplaysize(12).build();

		System.out.println(laptop);

	}
}
