package initstaticexample;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A ab = new A();
		System.out.println();
		B b = new B();
	}
	
	private static void example1(){
		A a = new A();
		a.publicMethodA();
		B b = new B();
		b.publicMethodA();
		System.out.println("");
		b = new B();
		System.out.println("");;
		B b2 = new B();
	}

}
