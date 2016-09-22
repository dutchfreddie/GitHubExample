package exceptions.more;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public MyException(){
		super();
	}
	
	public MyException(String message){
		super(message);
		this.message=message;
	}
	
	@Override
	public void printStackTrace(){
		super.printStackTrace();
		System.out.println("My Own Comment!");		
	}
	
	@Override
	public String getMessage(){
		return message;
	}
	
	
	
	

	

}
