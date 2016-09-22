package literalsexample.operators;

public class SubClass extends SuperClass implements ISubClass{
	
	public void output(SuperClass superC){
		if(superC instanceof SubClass)
			((SubClass)superC).doStuff();
	}

	void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("return values from subclass");
	}

	@Override
	public void doStuffInterface() {
		System.out.println("return values from interface");
		
	}
	
	

}
