package edu.unca.csci201;

public class Car {

	private int mileage;
	private int tank;
	private String model;

	public Car(int mileage, int tank, String model) {
		this.mileage = mileage;
		this.tank = tank;
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public int getTank() {
		return tank;
	}

	public String getModel() {
		return model;
	}

}
