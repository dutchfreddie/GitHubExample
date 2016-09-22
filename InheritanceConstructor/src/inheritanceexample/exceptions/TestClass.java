package inheritanceexample.exceptions;

class SomeThrowable extends Throwable { }
class MyThrowable extends SomeThrowable { }
public class TestClass{
	public static void main(String args[]) throws SomeThrowable, Exception{
		m2();
	}
	
	public static void m1() throws MyThrowable{
		throw new MyThrowable();
	}
	
	public static void m2() throws SomeThrowable, Exception{
		throw new Exception();
	}
}
