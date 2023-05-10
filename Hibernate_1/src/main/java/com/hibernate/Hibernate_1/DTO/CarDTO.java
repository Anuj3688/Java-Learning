package com.hibernate.Hibernate_1.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarDTO {

	@Id
	private int carNo;
	private String carName;
	private String carModel;
	private int carSpeed;

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarSpeed() {
		return carSpeed;
	}

	public void setCarSpeed(int carSpeed) {
		this.carSpeed = carSpeed;
	}

	@Override
	public String toString() {
		return "CarDTO [carNo=" + carNo + ", carName=" + carName + ", carModel=" + carModel + ", carSpeed=" + carSpeed
				+ "]";
	}

}
