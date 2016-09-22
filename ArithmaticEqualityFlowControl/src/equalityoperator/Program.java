package equalityoperator;

public class Program {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		A a13 = a1;
		A ab = new B();
		B b = new B();
		boolean b1 = a1==a2;
		boolean b2 = a1==a13;
		System.out.println(b1 + " " + b2);

		boolean in1 = (b instanceof A);
		boolean in2 = a1 instanceof B;
		boolean in3 = ab instanceof A;
		boolean in4 = ab instanceof B;
		boolean in5 = ab instanceof Object;
		}

}
