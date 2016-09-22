package constructorexample.chaining;

public class A extends AbstractA{

	private int x;
	private long l;
	
	public A(String s) {
		super(s);		
	}
	
	public A(String s,int x){
		this(s);
		this.x=x;
	}
	
	public A(long l){
		super();
		this.l=l;
	}

	@Override
	public void abstractMa() {
		// TODO Auto-generated method stub
		
	}
	
	public void concrateA(){
		super.concreteA();
		System.out.println("from A");	
	}
	
	public void varArgsM(String s, int... x){
		System.out.println(s);
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		System.out.println(x[5]);
	}

}
