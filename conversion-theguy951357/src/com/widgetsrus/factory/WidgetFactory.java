package com.widgetsrus.factory;

import java.util.Random;

public class WidgetFactory {

	private static long widgetCount;
	private static Random rand = new Random();
	
	public static Object produceWidget() {
	
		double val = rand.nextDouble() * 10;
		
		widgetCount ++;
		
		return new Widget(val);
		
	}
	
	public static long getWidgetCount() {
		return widgetCount;
	}
		
}
