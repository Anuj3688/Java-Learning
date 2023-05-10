package com.jspider.builder;

public class Mobile {

	String model;
	String brand;
	int ram;
	int rom;
	String processor;
	int battery;
	int frontcamera;
	int rearcamera;
	double price;
	String color;
	boolean fingerprint;

	public Mobile(String model, String brand, int ram, int rom, int battery, int frontcamera, int rearcamera,
			double price, String color, boolean fingerprint) {
		super();
		this.model = model;
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.battery = battery;
		this.frontcamera = frontcamera;
		this.rearcamera = rearcamera;
		this.price = price;
		this.color = color;
		this.fingerprint = fingerprint;
	}

	@Override
	public String toString() {
		return "Mobile : [\n model=" + model + ",\n brand=" + brand + ",\n ram=" + ram + ", \n rom=" + rom
				+ ", \n processor=" + processor + ", \n battery=" + battery + ",\n frontcamera=" + frontcamera
				+ ",\n rearcamera=" + rearcamera + ",\n price=" + price + ",\n color=" + color + ",\n fingerprint="
				+ fingerprint + "\n]";
	}

}
