package constructorexample.abstr;

public class B implements IB,IB2{

	private int b;
	private int b2;
	
	public B(){
		b=this.X;		
	}
	
	public B(int b){
		this.b=b;
	}
	
	public B(int b, int b2){
		this(b);
		this.b2=b2;
	}
}
