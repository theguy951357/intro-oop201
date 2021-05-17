package edu.unca.csci201;

public class Lightbulb {

	private boolean isOn = false;
	private boolean alive = true;
	private int lumens = 700;

	public boolean getState() {

		return isOn;
	}

//	public void turnOn() {
//		isOn = true;
//
//	}
//
//	public void turnOff() {
//		isOn = false;
//		lumens--;
//
//	}

	public int getLumens() {
		if (isOn) {
			return lumens;
		} else {
			return 0;
		}

	}

	public void toggle() {
		if (alive == false) {
			isOn = false;
			System.out.println("the lightbulb is broken.");
		} else {
			isOn = !isOn;
			if (isOn == false && lumens > 0) {
				lumens--;
			}

		}

	}

	public boolean checkLife() {
		if (lumens <= 0) {

			return alive = false;

		} else {
			return alive = true;
		}

	}

}
