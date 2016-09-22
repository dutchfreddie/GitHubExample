package factorydpexample;

public class ShapeFactory {

	public static IShape getShape(ShapeEnum shape, int xSize, int ySize, String name){
		IShape shapeproduct = null;
		switch(shape){		
		case SQUARE:
			shapeproduct = new Square(shape,xSize,ySize,name);
			break;
		case CIRCLE:
			shapeproduct = new Circle(shape,xSize,ySize,name);
			break;	
		case RECTANGLE:
			shapeproduct = new Rectangle(shape,xSize,ySize,name);
			break;		
		}	
		
		return shapeproduct;
	}
	
	
}
