package com.jspider.homewok.Homework;

public class Car {

	private String name;
	private int speed;
	private String model;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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

	@Override
	public String toString() {
		return "Car \n[ \n name=" + name + ",\n speed=" + speed + ",\n model=" + model + ",\n color=" + color + "\n]";
	}

}
