package com.jspider.bike;

public class Bike {
	private String bikeNmae;
	private String enginePower;
	private String bikeModel;

	public String getBikeNmae() {
		return bikeNmae;
	}

	public void setBikeNmae(String bikeNmae) {
		this.bikeNmae = bikeNmae;
	}

	public String getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}

	@Override
	public String toString() {
		return "Bike \n[ \n bikeNmae=" + bikeNmae + ",\n enginePower=" + enginePower + ",\n bikeModel=" + bikeModel
				+ "\n]";
	}

}
