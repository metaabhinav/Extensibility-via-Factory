package assignment;

import java.util.ArrayList;
import java.util.List;

import assignment.Shape.ShapeType;

public class TrialTest {

	public static void main(String[] args) {
		FactoryShape obj = new FactoryShape();
		Point p = new Point(4,4);
		List<Integer> a = new ArrayList<Integer>();
		a.add(6);
		a.add(8);
		Shape osf = obj.ShapeSet(ShapeType.Rectangle, p , a);
		Point t = new Point(7,5);
		System.out.println(osf.isPointEnclosed(t));
	}
}
