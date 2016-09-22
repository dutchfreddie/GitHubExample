package complete.inheritence.example;

public class ClassA  extends AbstractA implements InterfaceA,InterfaceB{

	private String s;	
	
	//static{System.out.println("Execute static ClassA");}
	//{System.out.println("Execute instance init ClassA");}
	
	public ClassA(int variableI,String s) {
		super(variableI);		
		this.s=s;
	}
	
	public static void staticMethodA(){
		System.out.println("Execute static method ClassA");
	}

	@Override
	protected void methodAbstractA() {
		// TODO Auto-generated method stub
		
	}
	
	void methodA(){
		System.out.println(X);
	}
	
	public final void method_finalA(){
		
	}
	
	public long methodWithIntReturn(){
		return 0;
	}
	
	public CovariantA returnCovariantA(){
		return new CovariantA();
	}
	
	

}
