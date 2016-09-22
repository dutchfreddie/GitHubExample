package daodpexample;

public class Test {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		IShapeTransfer circleTransfer = circle.getCircleTransferObject();
		IShapeDao fileDAO = DaoFactory.getShapeDAO("File");
		fileDAO.insertShape(circleTransfer);
	}

}
