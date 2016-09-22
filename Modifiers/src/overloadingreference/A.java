package overloadingreference;

public class A implements IA{

	@Override
	public void returnIA() {
		System.out.println("returnIA");
		
	}
	
	public final void returnAOnly(){
		System.out.println("returnAOnly");
	}

}
