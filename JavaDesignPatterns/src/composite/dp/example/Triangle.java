package composite.dp.example;

public class Triangle extends AbstractShape implements Shape {

	public Triangle(String typeShape) {
		super(typeShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(String fillColor) {
		System.out.println(typeShape.toUpperCase() + " has the color " + fillColor);

	}

}
