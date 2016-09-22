package constructorexample.chaining;

public abstract class AbstractA {
	
	private String s;
	
	public AbstractA(){
		
	}
	
	public AbstractA(String s){
		this.s=s;
	}
	
	public abstract void abstractMa();
	
	public void concreteA(){
		System.out.println("From abstract");
	}

}
