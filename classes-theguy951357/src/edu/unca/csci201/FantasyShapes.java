package edu.unca.csci201;

public class FantasyShapes {

	public static void main(String[] args) {
		// creates fantasy shapes.

		Triangle.triangleTop();
		Circle.circleBottom();

		Star.starTop();
		Triangle.triangleBottom();

		Square.squareTop();
		Triangle.triangleBottom();

		Circle.circleTop();
		Square.squareBottom();

	}

}
