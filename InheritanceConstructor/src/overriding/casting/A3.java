package overriding.casting;

public class A3 extends A2 {

	@Override
	public void printIA1() {
		System.out.println("IA1-from A3");		
	}
	
	@Override
	public void printIA2() {
		System.out.println("IA2-from A3");		
	}
}
