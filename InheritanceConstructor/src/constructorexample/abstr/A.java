package constructorexample.abstr;

public class A extends AbstractA {

	private String s;
	private boolean b;
	
		
	public A(int x, String s) {
		super(x);
		this.setS(s);		
	}
	
	public A(int x,String s,boolean b){
		this(x,s);
		this.setB(b);
	}

	
	public static void staticMethod(){
		
	}
	
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
	
	
}
