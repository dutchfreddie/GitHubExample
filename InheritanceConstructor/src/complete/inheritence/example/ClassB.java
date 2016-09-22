package complete.inheritence.example;

public class ClassB extends ClassA {
	

	//static{System.out.println("Execute static ClassB");}
//	{System.out.println("Execute instance init ClassB");}
	

	public ClassB(int variableI, String s) {
		super(variableI, s);		
	}	
	
	@Override
	public void methodAbstractA() {
		super.methodAbstractA();
		
	}
	
	@Override
	public void methodA(){
		super.methodA();
		getVariableI();
	}
	
	@Override
	public long methodWithIntReturn(){
		return 0;
	}
	
	@Override
	public CovariantB returnCovariantA(){
		return new CovariantB();
	}
	
	public CovariantA returnCovariantB(){
		return new CovariantA();
	}
	
	  
	

}
