package edu.unca.csci201;

public class PrettyShapes {

	public static void main(String[] args) {

		Drawerer d = new Drawerer();

		ShapeDrawer s = new DrawRectangle();
		ShapeDrawer square = new DrawSquare();
		ShapeDrawer rectAverage = new RectAverage();
		ShapeDrawer randomShape = new RandomShape().pickOne;
		ShapeDrawer smallRect = new SmallRectangle();

		// d.setShapeDrawer(rectAverage);

		d.setShapeDrawer(smallRect);

	}

}
