package com.jspider.Adapter;

public class FeatureValues {

	static int topSpeed;
	static int mileage;
	static String color;
	static int airbags;

	public static int getTopSpeed() {
		return topSpeed;
	}

	public static void setTopSpeed(int topSpeed) {
		FeatureValues.topSpeed = topSpeed;
	}

	public static int getMileage() {
		return mileage;
	}

	public static void setMileage(int mileage) {
		FeatureValues.mileage = mileage;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		FeatureValues.color = color;
	}

	public static int getAirbags() {
		return airbags;
	}

	public static void setAirbags(int airbags) {
		FeatureValues.airbags = airbags;
	}

}
