package edu.unca.csci201;

import java.util.Random;

public class RandomShape {

	Random rand = new Random();

	ShapeDrawer s = new DrawRectangle();
	ShapeDrawer square = new DrawSquare();
	ShapeDrawer rectAverage = new RectAverage();

	public ShapeDrawer[] shapes = { s, square, rectAverage };

	public ShapeDrawer pickOne = shapes[rand.nextInt(shapes.length - 1)];

}
