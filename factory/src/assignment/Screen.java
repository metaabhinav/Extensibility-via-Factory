package assignment;

import java.util.List;

import java.time.LocalTime;

import assignment.Shape.ShapeType;

/**
 * @author Abhinav
 *
 */
public class Screen {

	
	public List<Shape> shapeList;
	public List<LocalTime> timeList;
	
	
	/** add shape
	 * @param shapeType
	 * @param pt
	 * @param dimensions
	 * @return
	 */
	public boolean addShape(ShapeType shapeType, Point pt, List<Integer> dimensions) {
		FactoryShape obj = new FactoryShape();
		Shape shape = obj.ShapeSet(shapeType, pt , dimensions);
		if(shapeList.isEmpty()) {
			shapeList.add(shape);
			timeList.add(LocalTime.now());
			return true;
			}
		for(Shape iterator : shapeList) {
			if(iterator.getOrigin() == shape.getOrigin() && iterator.getArea() == shape.getArea()
					&& iterator.getPerimeter() == shape.getPerimeter()) {
				return false;
			}
		}
		shapeList.add(shape);
		timeList.add(LocalTime.now());
		return true;
	}
	
	/** delete the shape given from list
	 * @param shapeType
	 * @param pt
	 * @param dimensions
	 * @return
	 */
	public boolean deleteShape(ShapeType shapeType, Point pt, List<Integer> dimensions) {
		FactoryShape obj = new FactoryShape();
		Shape shape = obj.ShapeSet(shapeType, pt , dimensions);
		for(Shape iterator : shapeList) {
			if(iterator.getOrigin() == shape.getOrigin() && iterator.getArea() == shape.getArea()
					&& iterator.getPerimeter() == shape.getPerimeter() 
					&& iterator.getShapeType() == shape.getShapeType()) {
				int temp = shapeList.indexOf(iterator);
				shapeList.remove(iterator);
				timeList.remove(temp);
				return true;
			}
		}
		return false;
	}
	
	/** delete all the shapes of the input shpae type in given list
	 * @param shapeType 
	 */
	public void deleteAllShape(ShapeType shapeType) {
		for(Shape iterator : shapeList) {
			if(iterator.getShapeType() == shapeType) {
				int temp = shapeList.indexOf(iterator);
				shapeList.remove(iterator);
				timeList.remove(temp);
			}
		}
	}
	
	/**
	 * @return the list of the shape according to the area
	 */
	public List<Shape> sortAccToArea() {
		int sizeOfList = shapeList.size();  
        Shape tempShape;
        LocalTime tempTime;
         for(int index1 = 0 ; index1 < sizeOfList; index1++){  
                 for(int index2 = 1; index2 < (sizeOfList - index1); index2++){  
                          if(shapeList.get(index2-1).getArea() > shapeList.get(index2).getArea()){  
                                 //swap elements  
                                 tempShape = shapeList.get(index2 - 1);  
                                 tempTime = timeList.get(index2 - 1);
                                 
                                 shapeList.set(index2 - 1 , shapeList.get(index2)); 
                                 timeList.set(index2 - 1 , timeList.get(index2));
                                 
                                 shapeList.set(index2 , tempShape);
                                 timeList.set(index2 , tempTime);  
                         }  
                  }
         }
		return shapeList;
	}
	
	/**
	 * @return the list of shapes in sorted form according to the perimeter
	 */
	public List<Shape> sortAccToPerimeter() {
		int sizeOfList = shapeList.size();  
        Shape tempShape;
        LocalTime tempTime;
         for(int index1 = 0 ; index1 < sizeOfList; index1++){  
                 for(int index2 = 1; index2 < (sizeOfList - index1); index2++){  
                          if(shapeList.get(index2-1).getPerimeter() > shapeList.get(index2).getPerimeter()){  
                                 //swap elements  
                                 tempShape = shapeList.get(index2 - 1);  
                                 tempTime = timeList.get(index2 - 1);
                                 
                                 shapeList.set(index2 - 1 , shapeList.get(index2)); 
                                 timeList.set(index2 - 1 , timeList.get(index2));
                                 
                                 shapeList.set(index2 , tempShape);
                                 timeList.set(index2 , tempTime);  
                         }  
                  }
         }
		return shapeList;
	}
	
	/**
	 * @return the list of all the shape in sorted form according to the timestamp
	 */
	public List<Shape> sortAccToTimeStamp() {
		int sizeOfList = shapeList.size();  
        Shape tempShape;
        LocalTime tempTime;
         for(int index1 = 0 ; index1 < sizeOfList; index1++){  
                 for(int index2 = 1; index2 < (sizeOfList - index1); index2++){  
                	 	int tempVal = timeList.get(index2-1).compareTo(timeList.get(index2));
                          if(tempVal < 0){  
                                 //swap elements  
                                 tempShape = shapeList.get(index2 - 1);  
                                 tempTime = timeList.get(index2 - 1);
                                 
                                 shapeList.set(index2 - 1 , shapeList.get(index2)); 
                                 timeList.set(index2 - 1 , timeList.get(index2));
                                 
                                 shapeList.set(index2 , tempShape);
                                 timeList.set(index2 , tempTime);  
                         }  
                  }
         }
		return shapeList;
	}
	
	/**
	 * @return the list of the shapes in the sorted form according to the origin distance
	 */
	public List<Shape> sortAccToOriginDistance() {
		int sizeOfList = shapeList.size();  
        Shape tempShape;
        LocalTime tempTime;
         for(int index1 = 0 ; index1 < sizeOfList; index1++){  
                 for(int index2 = 1; index2 < (sizeOfList - index1); index2++){  
                	 Point temp1 = shapeList.get(index2-1).getOrigin();
                	 Point temp2 = shapeList.get(index2).getOrigin();
                	 float tempNum1 = (temp1.getX() * temp1.getX()) + (temp1.getY() * temp1.getY());
                	 float tempNum2 = (temp2.getX() * temp2.getX()) + (temp2.getY() * temp2.getY());
                          if(tempNum1 > tempNum2){  
                                 //swap elements  
                                 tempShape = shapeList.get(index2 - 1);  
                                 tempTime = timeList.get(index2 - 1);
                                 
                                 shapeList.set(index2 - 1 , shapeList.get(index2)); 
                                 timeList.set(index2 - 1 , timeList.get(index2));
                                 
                                 shapeList.set(index2 , tempShape);
                                 timeList.set(index2 , tempTime);  
                         }  
                  }
         }
		return shapeList;
	}
	
	/**
	 * @param checkPoint points to be checked in the shape
	 * @return  true if the point is in shape else return false
	 */
	@SuppressWarnings("null")
	public List<Shape> pointEnclosing(Point checkPoint){
		List<Shape> resultantshapeList = null ;
		for(Shape iterator : shapeList) {
			if( iterator.isPointEnclosed(checkPoint) == true) {
				resultantshapeList.add(iterator);
			}
		}
		return resultantshapeList;
	}
}
