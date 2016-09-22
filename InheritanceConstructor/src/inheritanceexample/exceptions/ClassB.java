package inheritanceexample.exceptions;

public class ClassB extends ClassA {


	int y = 20;
	
	public void throwMyException(int x) throws MyException, MyException2{
		super.throwMyException(x);
		if(x==2)
			throw new MyException2();
	}
	
	public void throwMyException2(int x) throws MyExceptionSub{
		
	}
	
	public void method1_A() throws MyException2{
		
	}
}
