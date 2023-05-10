package com.jspider.builder;

public class MobileBuilder {

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

	public MobileBuilder model(String model) {
		this.model = model;
		return this;
	}

	public MobileBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}

	public MobileBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}

	public MobileBuilder rom(int rom) {
		this.rom = rom;
		return this;
	}

	public MobileBuilder processor(String processor) {
		this.processor = processor;
		return this;
	}

	public MobileBuilder battery(int battery) {
		this.battery = battery;
		return this;
	}

	public MobileBuilder frontcamera(int frontcamera) {
		this.frontcamera = frontcamera;
		return this;
	}

	public MobileBuilder rearcamera(int rearcamera) {
		this.rearcamera = rearcamera;
		return this;
	}

	public MobileBuilder price(double price) {
		this.price = price;
		return this;
	}

	public MobileBuilder color(String color) {
		this.color = color;
		return this;
	}

	public MobileBuilder fingerprint(boolean fingerprint) {
		this.fingerprint = fingerprint;
		return this;
	}

	public Mobile build() {
		Mobile mobile = new Mobile(this.model, this.brand, this.ram, this.rom, this.battery, this.frontcamera,
				this.rearcamera, this.price, this.color, this.fingerprint);
		return mobile;
	}
}
