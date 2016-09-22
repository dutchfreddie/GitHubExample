package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSubClass extends ExceptionSuperClass {

	@Override
	public void tryCatchExample(){
		try{
			String s = "c";
			int i = Integer.valueOf(s);
			System.out.println(i);
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void throwsExceptionExample(){
		
	}
	
	@Override
	public void throwIOExceptionExample() throws IOException{
		
	}
	
	@Override
	public void throwsMixedException() throws IOException, NumberFormatException{
		
	}
	
	@Override
	public void nfeMethod() throws RuntimeException{
		String s = "6";
		int i = Integer.valueOf(s);
		System.out.println(i);
	}

	@Override
	public void reMethod() throws NumberFormatException{
		
	}
	
	@Override
	public void ioeMethod() throws IOException{
		File f = new File("");
		FileReader fr = new FileReader(f);		
	}
	
	@Override
	public void ioeMethod2() throws NullPointerException{
		
	}
	
	public void escMethod(){
		
	}

}
