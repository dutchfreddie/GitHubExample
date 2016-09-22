package composite.dp.example;

public class Circle  extends AbstractShape implements Shape {

	public Circle(String typeShape) {
		super(typeShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(String fillColor) {
		System.out.println(typeShape + " has the color " + fillColor);

	}

}
