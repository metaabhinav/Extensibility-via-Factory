package assignment;


/**Shape is an interface that will expose certain basic APIs like getArea, 
 * getPerimeter, getOrigin and isPointEnclosed. 

 * @author Abhinav
 *
 */
public interface Shape {

	/**
	 * @return area of the shape
	 */
	public float getArea();
	
	/**
	 * @return perimeter of the shape
	 */
	public float getPerimeter();
	
	/**
	 * @return the origin x,y of the shape
	 */
	public Point getOrigin();
	
	/**
	 * @param tempPt the point which we have to check whether it is inside the shape or not
	 * @return true , if point enclosed in shape else return false
	 */
	public boolean isPointEnclosed(Point tempPt);
	
	/**
	 * @return shape tyep of the shape
	 */
	public ShapeType getShapeType();
	
	public enum ShapeType{
		Rectangle,
		Square,
		Circle,
		Triangle
	}
	
}
