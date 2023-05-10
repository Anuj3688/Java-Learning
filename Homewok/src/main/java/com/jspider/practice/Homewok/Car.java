package com.jspider.practice.Homewok;

public class Car {
	private String name;
	private String model;
	private String color;
	private String speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}

}
