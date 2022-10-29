package assignment;

import java.util.List;

/**Rectangle is an interface that will expose certain basic APIs like getArea, 
 * getPerimeter, getOrigin and isPointEnclosed. 
 * @author Abhinav
 *
 */
public class Rectangle implements Shape{

	Point pt;
	int base;
	int height;
	
	
	/**
	 * @param pt of the left down corner
	 * @param dimensions of the shape
	 */
	public Rectangle(Point pt, List<Integer> dimensions) {
		this.base = dimensions.get(0);
		this.height = dimensions.get(1);
		this.pt = pt;
	}
	
	/**
	 * @return area of the shape
	 */
	public float getArea() {
		return height * base;
	}

	/**
	 * @return perimeter of the shape
	 */
	public float getPerimeter() {
		return (2 * height) + (2 * base);
	}
	
	/**
	 * @return the origin x,y of the shape
	 */
	public Point getOrigin() {
		return pt;
	}
	
	/**
	 * @param tempPt the point which we have to check whether it is inside the shape or not
	 * @return true , if point enclosed in shape else return false
	 */
	public boolean isPointEnclosed(Point tempPt) {
		return FindPoint(pt.getX() , pt.getY() , pt.getX()+base , pt.getY()+height , tempPt.getX() , tempPt.getY());
	}

	
	/**
	 *return shape type of the shape
	 */
	public ShapeType getShapeType() {
		return ShapeType.Rectangle;
	}

	/**
	 * @param lDcornerX left down corner x coordinate
	 * @param lDcornerY left down corner y coordinate
	 * @param rUcornerX right up corner x coordinate
	 * @param ruCornerY right up corner y coordinate
	 * @param checkX x coordinate of the check points
	 * @param checkY y coordinate of the check points
	 * @return true , if point enclosed in shape else return false
	 */
	static boolean FindPoint(int lDcornerX, int lDcornerY, int rUcornerX, int ruCornerY, int checkX, int checkY){
		if (checkX > lDcornerX && checkX < rUcornerX && checkY > lDcornerY && checkY < ruCornerY)
			return true;

		return false;
		}
}
