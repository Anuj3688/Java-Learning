package com.Builder;

public class Laptop {

	String brand;
	String ram;
	String rom;
	int displaysize;

	public Laptop(String brand, String ram, String rom, int displaysize) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.displaysize = displaysize;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", rom=" + rom + ", displaysize=" + displaysize + "]";
	}

}
