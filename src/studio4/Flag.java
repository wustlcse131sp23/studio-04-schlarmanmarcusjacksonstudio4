package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.LIGHT_GRAY);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.2);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5,0.5,0.15,0.025);
		StdDraw.filledRectangle(0.5,0.5,0.025,0.15);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledEllipse(0.54, 0.54, 0.02, 0.02);
	}
}