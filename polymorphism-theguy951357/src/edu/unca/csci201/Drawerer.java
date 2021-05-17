package edu.unca.csci201;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;
import java.util.Random;

public class Drawerer extends Frame implements MouseListener {

	private ShapeDrawer mShapeDrawer;
	private Random rand = new Random();
	private Point2D [] centerPoints;
	private Point2D [] sizePoints;
	private Color [] colors;
	
	public void setShapeDrawer(ShapeDrawer s) {
		mShapeDrawer = s;
		setVisible(true);
		repaint();
	}
	
	public Drawerer() {
		
		super("Magic Drawerer version 1.0");
		
		setSize(450, 450);
		
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		}
		);
		addMouseListener(this);
		
	}
	
	
	
	@Override
	public void paint(Graphics og) {
		if (mShapeDrawer == null)
			return;
		
		if (centerPoints == null) 
			resetShapes();
		
		Graphics2D g = (Graphics2D)og;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		        RenderingHints.VALUE_ANTIALIAS_ON);
		for (int i = 0; i < centerPoints.length; i ++) {
			
			try {
				mShapeDrawer.drawShape(g, (int)centerPoints[i].getX(), (int)centerPoints[i].getY(),
						(int)sizePoints[i].getX(), (int)sizePoints[i].getY(), colors[i]);
				
			} catch (ShapeTooLargeException e) {
			}
		}
		
	}

	
    private void resetShapes() {
    	int numShapes = rand.nextInt(39) + 1;
    	
    	Dimension windowSize = getSize();
		
    	centerPoints = new Point2D[numShapes];
		for (int i = 0; i < numShapes; i ++) {
			centerPoints[i] = new Point2D.Double(rand.nextInt(windowSize.width), rand.nextInt(windowSize.height));
		}
		sizePoints = new Point2D[numShapes];
		for (int i = 0; i < numShapes; i ++) {
			sizePoints[i] = new Point2D.Double(rand.nextInt(150), rand.nextInt(150));
		}
		colors = new Color[numShapes];
		for (int i = 0; i < numShapes; i ++) {
			colors[i] = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
		}
		this.repaint();
		
    }

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		resetShapes();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
