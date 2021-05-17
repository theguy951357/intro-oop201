package edu.unca.csci201;

import java.awt.Color;
import java.awt.Graphics2D;

public class RectAverage extends DrawRectangle {

	public int[] previousRect = new int[4];

	@Override
	public void drawShape(Graphics2D g, int centerX, int centerY, int sizeX, int sizeY, Color color)
			throws ShapeTooLargeException {

		g.setColor(color);
		g.drawRect((centerX + previousRect[0]) / 2, (centerY + previousRect[1]) / 2, (sizeX + previousRect[2]) / 2,
				(sizeY + previousRect[3]) / 2);
		previousRect[0] = centerX;
		previousRect[1] = centerY;
		previousRect[2] = sizeX;
		previousRect[3] = sizeY;
	}

}
