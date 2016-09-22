package overriding;

public class B extends A implements IB{

	@Override
	public void printoutB() {
		System.out.println("out B");
		
	}
	
	@Override
	public void printOutA() throws Exception{
		//super.printOutA();
		System.out.println("printOutA out B");
		
	}



	
}
