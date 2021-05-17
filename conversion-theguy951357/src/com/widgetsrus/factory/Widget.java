package com.widgetsrus.factory;

public class Widget {

	private double size;
	
	protected Widget(double s) {
		size = s;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
}
