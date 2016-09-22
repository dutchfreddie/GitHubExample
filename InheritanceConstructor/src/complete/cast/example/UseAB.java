package complete.cast.example;

public class UseAB {
	
	public void method(ClassA a){
		System.out.println("method with ClassA as argument");
		a.methodA();
		a.methodAB();		
	}
	
	public void method(ClassB b){
		System.out.println("method with ClassB as argument");
		b.methodA();
		b.methodAB();
		b.methodB();
	}

}
