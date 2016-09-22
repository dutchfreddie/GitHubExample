package factorydpexample;

public class Circle extends AbstractShape {	
	

	public Circle(ShapeEnum enumShape, int xSize, int ySize, String name) {
		super(enumShape, xSize, ySize, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double returnSurfaceShape() {
		
		double surface = Math.PI*Math.pow(0.5*xSize, 2); 
		
		return surface;
	}

	@Override
	public int getSizeX() {
		// TODO Auto-generated method stub
		return xSize;
	}

	@Override
	public ShapeEnum getShapeEnum() {
		// TODO Auto-generated method stub
		return ShapeEnum.CIRCLE;
	}

}
