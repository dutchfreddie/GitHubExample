package castingexample2;

public class A {

	public A(){
		this.constructorMethodA();
	}
	
	void returnFromA(){
		System.out.println("FromA, classA");
	}
	
	private void constructorMethodA(){
		System.out.println("Form constructor A");
	}
	
	static void doStuff(){
		System.out.println("from static method, class A");
	}
}
