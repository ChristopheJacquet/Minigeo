package eu.jacquet80.minigeo;

import java.awt.Color;

/**
 * Segment of a linear shape, such as a road.
 * 
 * @author Christophe Jacquet
 *
 */
public class Segment {
	private final Point pointA, pointB;
	private final Color color;
	
	/**
	 * Creates a new segment.
	 * 
	 * @param pointA the first point
	 * @param pointB the second point
	 * @param color the color of the segment
	 */
	public Segment(Point pointA, Point pointB, Color color) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.color = color;
	}

	/**
	 * Returns the first point of the segment ("A")
	 * 
	 * @return the first point of the segment
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * Returns the second point of the segment ("B")
	 * 
	 * @return the second point of the segment
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * Returns the color of the segment
	 * 
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	
}
