package assignment;

/**
 * @author Abhinav
 *
 */
public class Point {

	private int x;
	private int y;
	
	/**
	 * @param x coordinate
	 * @param y coordinate
	 */
	public Point(int x, int y) {
		if((x < 0) || ((y < 0)))
			throw new AssertionError("Points should be in positive xy plane");
		this.x = x;
		this.y = y;
	}

	/** 
	 * @return x coordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return y coordinate
	 */
	public int getY() {
		return y;
	}
	
	
}
