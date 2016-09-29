package overwritingmethods.returntype;

import java.io.IOException;

public class A{

	public int methodPrimitve(){
		return 1;
	}
	
	public Number methodWrapper(){
		return new Integer(2);
	}
	
	public B methodReference(){
		return new B();
	}

}
