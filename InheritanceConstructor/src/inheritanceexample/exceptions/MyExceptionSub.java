package inheritanceexample.exceptions;

public class MyExceptionSub extends MyException {

	
	@Override
	public String getMessage(){
		return "Exception from MyExceptionSub";		
	}
}
