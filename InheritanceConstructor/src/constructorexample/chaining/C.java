package constructorexample.chaining;

public class C {
	
	private long l;
	private String s;
	
	public C(long l){
		this.l=l;
	}
	
	public C(long l,String s){
		this(l);
		this.s=s;
	}

}
