package factorydpexample;

public class Rectangle extends AbstractShape{

	

	public Rectangle(ShapeEnum enumShape, int xSize, int ySize, String name) {
		super(enumShape, xSize, ySize, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double returnSurfaceShape() {
		// TODO Auto-generated method stub
		return ySize*xSize;
	}

	@Override
	public int getSizeX() {
		// TODO Auto-generated method stub
		return xSize;
	}

	@Override
	public ShapeEnum getShapeEnum() {
		// TODO Auto-generated method stub
		return ShapeEnum.RECTANGLE;
	}

}
