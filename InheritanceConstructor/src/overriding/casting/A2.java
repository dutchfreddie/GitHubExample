package overriding.casting;

public class A2 extends A1 implements IA2 {

	@Override
	public void printIA2() {
		System.out.println("IA2-from A2");		
	}
	
	@Override
	public void printIA1() {
		System.out.println("IA1-from A2");		
	}

}
