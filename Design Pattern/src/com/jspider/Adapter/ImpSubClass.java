package com.jspider.Adapter;

public class ImpSubClass extends FeatureValues implements FeatureOfCar {

	@Override
	public void topSpeed() {
		setTopSpeed(300);
		System.out.println("Top Speed Of Car is     : " + getTopSpeed());
	}

	@Override
	public void mileage() {
		setMileage(25);
		System.out.println("The Mileage Of Car is   : " + getMileage());
	}

	@Override
	public void color() {
		setColor("White");
		System.out.println("The Color Of Car is     : " + getColor());
	}

	@Override
	public void airbags() {
		setAirbags(6);
		System.out.println("The Car have " + getAirbags() + " Airbags");
	}

}
