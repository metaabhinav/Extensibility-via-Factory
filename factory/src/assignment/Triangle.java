package assignment;

import java.util.List;

/**
 * @author Abhinav
 *
 */
public class Triangle implements Shape{

	Point pt;
	int base;
	int height;
	
	public Triangle( Point pt, List<Integer> dimensions) {
		this.base = dimensions.get(0);
		this.height = dimensions.get(1);
		this.pt = pt;
	}
	
	/**
	 *
	 */
	public float getArea() {
		return (float) (0.5 * base * height);
	}

	/**
	 *
	 */
	public float getPerimeter() {
		return 3 * base;
	}
	
	/**
	 *
	 */
	public Point getOrigin() {
		return pt;
	}
	
	/**
	 *
	 */
	public boolean isPointEnclosed(Point tempPt) {
		return isInside(pt.getX() , pt.getY() , pt.getX()+base , pt.getY() , (pt.getX()+base)/2 ,pt.getY()+height , tempPt.getX(), tempPt.getY());
	}
	
	/**
	 *
	 */
	public ShapeType getShapeType() {
		return ShapeType.Triangle;
	}
	
	 /**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param x
	 * @param y
	 * @return
	 * 
		 *    B(10,30)
	     *          / \
	     *         /   \
	     *        /     \
	     *       /       \      P
	     *      /         \
	  *   A(0,0) ----------- C(20,0) 
	 */
	static boolean isInside(int x1, int y1, int x2,
             int y2, int x3, int y3, int x, int y)
	 {  
	    /* Calculate area of triangle ABC */
	     double A = area (x1, y1, x2, y2, x3, y3);
	   
	    /* Calculate area of triangle PBC */ 
	     double A1 = area (x, y, x2, y2, x3, y3);
	   
	    /* Calculate area of triangle PAC */ 
	     double A2 = area (x1, y1, x, y, x3, y3);
	   
	    /* Calculate area of triangle PAB */  
	     double A3 = area (x1, y1, x2, y2, x, y);
	     
	    /* Check if sum of A1, A2 and A3 is same as A */
	     return (A == A1 + A2 + A3);
 }
	 
	 /**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	static double area(int x1, int y1, int x2, int y2, int x3, int y3)
			{
			return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
			         x3*(y1-y2))/2.0);
			}
}
