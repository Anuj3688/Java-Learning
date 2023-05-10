package com.jspider.task.Adapter;

import com.jspider.Adapter.FeatureValues;

public class ImpSubClass extends FeatureValues implements FeatureOfBike {

	@Override
	public void topSpeed() {
		setTopSpeed(300);
		System.out.println("Top Speed Of Bullet is     : " + getTopSpeed());
	}

	@Override
	public void mileage() {
		setMileage(25);
		System.out.println("The Mileage Of Bullet is   : " + getMileage());
	}

	@Override
	public void color() {
		setColor("White");
		System.out.println("The Color Of Bullet is     : " + getColor());
	}

}
