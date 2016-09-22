package overriding;

public class A implements IA{

	private int x;
	public String variable;
	
	public A(){
		
	}
	
	
	
	
	static void staticReturn(){
		
	}
	@Override
	public void printOutA() throws Exception {
		System.out.println("printOutA out A");
		
	}	
}



