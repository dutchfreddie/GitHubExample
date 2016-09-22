package exceptions;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MyException(){
		super();
	}
	
	public MyException(String message){
		super(message);
	}
	
	@Override
	public void printStackTrace(){
		super.printStackTrace();
		System.out.println("My Own Comment!");
		
	}
	
	

	

}
