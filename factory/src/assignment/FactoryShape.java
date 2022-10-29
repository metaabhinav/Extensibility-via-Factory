package assignment;

import java.util.List;

import assignment.Shape.ShapeType;

/**
 * @author Abhinav
 *
 */
public class FactoryShape {

	/** FactorySHape promotes DataHiding
	 * @param shapeType 
	 * @param pt of the shape
	 * @param dimensions of the shape
	 * @return
	 */
	public Shape ShapeSet(ShapeType shapeType, Point pt, List<Integer> dimensions) {

		switch (shapeType) {
		case  Rectangle:
			Shape rect  = new Rectangle(pt , dimensions);
			return rect;
		case Square: 
			return new Square(pt, dimensions);
			
		case Circle:
			return new Circle(pt, dimensions);
		
		case Triangle:
			return new Triangle(pt, dimensions);
			
		default:
			return null;
			
		}
	}
}
