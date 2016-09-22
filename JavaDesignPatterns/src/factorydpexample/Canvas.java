package factorydpexample;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	List<IShape> shapeCollection = new ArrayList<IShape>();
	
	public void addNewShape(ShapeEnum shape,int xSize,int ySize,String name){
		IShape shapeproduct = ShapeFactory.getShape(shape, xSize, ySize, name);
		shapeCollection.add(shapeproduct);
	}
	
	public double totSurfaceShapes(){
		double totSurface = 0;
		for(IShape shapeproduct:shapeCollection){
			totSurface += shapeproduct.returnSurfaceShape();
		}
		
		return totSurface;
	}
	
	public void getSurfaceForEachShapeAdded(){
		for(IShape shape:shapeCollection){
			System.out.println(shape.getShapeEnum().toString() + " " + shape.getName() + ": " + shape.returnSurfaceShape());
		}
	}
	
	
	
}
