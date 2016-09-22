package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSuperClass {

	
	public void tryCatchExample(){
		try{
			String s = "c";
			int i = Integer.valueOf(s);
			System.out.println(i);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void throwsExceptionExample() throws Exception{
		
	}
	
	public void throwIOExceptionExample() throws  Exception{
		
	}
	
	public void throwsMixedException() throws RuntimeException, Exception{
		
	}
	
	public synchronized void myExceptionMethod(int i){
		try {
			throwMyCustomException(i);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public synchronized void myExceptionMethod2(int i) throws MyException{
		throwMyCustomException(i);
	}
	private void throwMyCustomException(int i) throws MyException{
		if(i>10)
			throw new MyException(i + " is veel te hoog!");
		else
			System.out.println("correct throw");
	}
	
	public void throwsMyException(int i) throws MyException {
		if(i>10)
			throw new MyException(i + " is veel te hoog!");
		else
			System.out.println("correct throw");
	}
	
	
	
	
	public void npeMethod() throws NullPointerException{
		String s = null;
		int i = s.length();		
	}
	
	public void nfeMethod() throws NumberFormatException{
		String s = "oo";
		int i = Integer.valueOf(s);
		System.out.println(i);
	}
	
	public void ioeMethod() throws Exception{
		File f = new File("");
		FileReader fr = new FileReader(f);		
	}
	
	public void reMethod() throws RuntimeException{
		
	}
	
	public void ioeMethod2() throws Exception, IOException,NumberFormatException{
		
	}
	
	public void myeMethod(int i){
		try {
			throwMyException(i);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void throwMyException(int i) throws MyException{
		if(i>10)
			throw new MyException(i + " is veel te hoog!");
		else
			System.out.println("correct throw");
	}
	
	
}
