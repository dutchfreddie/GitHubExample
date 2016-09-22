package castingexample2;

public class B1 extends A {

	public B1(){
		super();
		System.out.println("From Constructor B1");
	}
	
	void returnFromA(){
		System.out.println("FromA, classB1");
	}
	
	void returnFromB1(){
		System.out.println("FromB1, classB1");
	}
	
	static void doStuff(){
		System.out.println("from static method, class B1");
	}

}
