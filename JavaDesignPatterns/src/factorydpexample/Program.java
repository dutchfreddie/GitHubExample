package factorydpexample;

public class Program {

	public static void main(String[] args) {
		
		Canvas canvas = new Canvas();
		canvas.addNewShape(ShapeEnum.CIRCLE, 2, 0, "1");
		canvas.addNewShape(ShapeEnum.RECTANGLE, 2, 6,"2");
		canvas.addNewShape(ShapeEnum.SQUARE, 5, 0, "3");
		double totSurface = canvas.totSurfaceShapes();
		System.out.println("total Surface: " + totSurface);
		canvas.getSurfaceForEachShapeAdded();

	}

}
