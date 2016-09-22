package complete.cast.overloading.example;

public class ClassC extends ClassB{

	@Override
	public void methodAB() {
		System.out.println("methodAB in B");
		
	}
	
	public void methodB() {
		System.out.println("methodB in C");
		
	}
	
	public void methodC() {
		System.out.println("methodC in C");
		
	}
}
