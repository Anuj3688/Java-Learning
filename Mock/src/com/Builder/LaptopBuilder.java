package com.Builder;

public class LaptopBuilder {

	String brand;
	String ram;
	String rom;
	int displaysize;

	public LaptopBuilder setbrand(String brand) {
		this.brand = brand;
		return this;
	}

	public LaptopBuilder setram(String ram) {
		this.ram = ram;
		return this;
	}

	public LaptopBuilder setrom(String rom) {
		this.rom = rom;
		return this;
	}

	public LaptopBuilder setdisplaysize(int displaysize) {
		this.displaysize = displaysize;
		return this;
	}

	public Laptop build() {
		Laptop laptop = new Laptop(this.brand, this.ram, this.rom, this.displaysize);
		return laptop;
	}

}
