package inheritanceexample.exceptions;

public class MyException3 extends MyException2 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage(){
		return "Exception from MyException3";
		
	}
}
