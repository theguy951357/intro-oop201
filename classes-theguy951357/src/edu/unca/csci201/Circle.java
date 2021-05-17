package edu.unca.csci201;

public class Circle {
	public static void circle() {

		circleTop();
		circleBottom();
	}

	public static void circleTop() {
		System.out.println("  /----\\  ");
		System.out.println(" /      \\");
		System.out.println(" |      |");

	}

	public static void circleBottom() {
		System.out.println(" |      |");
		System.out.println(" \\      /");
		System.out.println("  \\----/");

		System.out.println();

	}
}
