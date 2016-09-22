package composite.dp.example;

public class TestComposite {

	public static void main(String[] args) {
		
		Shape tri = new Triangle("triangle1");
		Shape tri1 = new Triangle("triangle2");
		Shape cir = new Circle("circle");
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		drawing.draw("Red");
		System.out.println();
		drawing.clear();
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");

	}

}
