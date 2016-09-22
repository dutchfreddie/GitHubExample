package overloadingreference;

public class B extends A{

	@Override
	public void returnIA() {
		super.returnIA();
		System.out.println("returnIB");
		
	}	
	
	public void returnB(){
		System.out.println("returnB");
	}
}
