package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import assignment.Shape.ShapeType;

class ScreenTest {

	@Test
	void testForFactoryShape_addObjectCheckArea() {
		FactoryShape obj = new FactoryShape();
		Point pt = new Point(1,1);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		Shape object = obj.ShapeSet(ShapeType.Circle, pt , list);
		assertEquals(28.260000228881836,object.getArea());
	}

	@Test
	void testForFactoryShape_addObjectCheckPerimeter() {
		FactoryShape obj = new FactoryShape();
		Point pt = new Point(2,3);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		Shape object = obj.ShapeSet(ShapeType.Rectangle, pt , list);
		assertEquals(16.0,object.getPerimeter());
	}
	
	@Test
	void testForFactoryShape_addObjectCheckIsEnclosing() {
		FactoryShape obj = new FactoryShape();
		Point pt = new Point(4,4);
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(8);
		Shape object = obj.ShapeSet(ShapeType.Triangle, pt , list);
		Point checkPoint = new Point(7,5);
		assertEquals(true,object.isPointEnclosed(checkPoint));
	}
	
	@Test
	void testForScreen_addShape() {
		Point pt = new Point(2,3);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		Screen object = new Screen();
		assertEquals(true,object.addShape(ShapeType.Rectangle, pt, list));
	}
	
	@Test
	void testForScreen_addAndDeleteShape() {
		Point pt1 = new Point(2,3);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		Screen object = new Screen();
		object.addShape(ShapeType.Rectangle, pt1, list1);
		
		Point pt2 = new Point(5,7);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(4);
		list2.add(6);
		Screen object2 = new Screen();
		object2.addShape(ShapeType.Square, pt2, list2);
		
		Point pt3 = new Point(2,3);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		list3.add(5);
		Screen object3 = new Screen();
		assertEquals(true,object3.deleteShape(ShapeType.Rectangle, pt3, list3));
	}
	
	
}
