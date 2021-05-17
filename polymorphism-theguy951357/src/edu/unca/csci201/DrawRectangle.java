package edu.unca.csci201;

import java.awt.Color;
import java.awt.Graphics2D;

public class DrawRectangle implements ShapeDrawer {

	@Override
	public void drawShape(Graphics2D g, int centerX, int centerY, int sizeX, int sizeY, Color color) throws ShapeTooLargeException{

		g.setColor(color);
		g.drawRect(centerX, centerY, sizeX, sizeY);
	}

}
