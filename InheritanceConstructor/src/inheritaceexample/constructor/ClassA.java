package inheritaceexample.constructor;

public class ClassA extends AbstractA {
	
	private String s;
	private long l;
	
	public ClassA(int x,String s){
		super(x);
		this.s=s;
	}
	
	public ClassA(long l){
		super();
		this.l=l;
	}

	

	
	
	
	
	
	
	

}
