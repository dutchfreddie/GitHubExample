package exceptions.more;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A implements IA{

	@Override
	public void throwIOException() throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void throwException(){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void throwsMyException(int x) throws MyException {
		try{
			checkLargerThan5(x);
		}
		catch(MyException e){
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			throw e;
		}		
	}
	
	private void checkLargerThan5(int x) throws MyException{
		if(x<5)
			throw new MyException("checked in to small number: " + x);
		else
			System.out.println("" + x + " is indeed larger than 4");
	}
	
	public void overrideMethod(int x) throws IOException{
		
	}
	
	public double overrideMethod(int x, String s){
		return 0;		
	}

	
	public void superNoSuperMethod() throws Error{
		
	}
}
