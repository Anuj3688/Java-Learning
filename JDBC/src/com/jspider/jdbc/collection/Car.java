package com.jspider.jdbc.collection;

public class Car {
	String carName;
	String carId;
	String carColor;
	String carType;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carId=" + carId + ", carColor=" + carColor + ", carType=" + carType + "]";
	}

}
