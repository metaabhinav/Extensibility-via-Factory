package assignment;

import java.util.List;

/**
 * @author Abhinav
 *
 */
public class Circle implements Shape{

	int radius;
	Point centre;
	
	/**
	 * @param pt
	 * @param dimensions
	 */
	public Circle(Point pt, List<Integer> dimensions) {
		this.radius = dimensions.get(0);
		this.centre = pt;
	}
	
	/**
	 *
	 */
	public float getArea() {
		return (float) (3.14 * radius * radius);
	}

	/**
	 *
	 */
	public float getPerimeter() {
		return (float) (2 * 3.14 * radius);
	}
	
	
	/**
	 *
	 */
	public Point getOrigin() {
		double temp = Math.sqrt((centre.getX() * centre.getX())+(centre.getY() * centre.getY()));
		double tempA = centre.getX() + centre.getX()/temp * radius;
		double tempB = centre.getY() + centre.getY()/temp * radius;
		Point corner = new Point((int)tempA , (int)tempB);
		return corner;
	}
	
	/**
	 *
	 */
	public boolean isPointEnclosed(Point tempPt) {
		float tempX= tempPt.getX() - centre.getX();
		float tempY= tempPt.getY() - centre.getY();
		if(Math.pow(tempX,2) + Math.pow(tempY, 2) <= Math.pow(radius, 2))
			return true;
		return false;
	}

	/**
	 * 
	 */
	public ShapeType getShapeType() {
		return ShapeType.Circle;
	}
	
}
