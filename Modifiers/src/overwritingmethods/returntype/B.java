package overwritingmethods.returntype;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class B extends A{

	@Override
	public int methodPrimitve(){
		return super.methodPrimitve();
	}
	
	@Override
	public Integer methodWrapper(){
		return new Integer(2);
	}
	
	
	@Override
	public C methodReference(){
		return (C) new C();
	}
	
	

}
