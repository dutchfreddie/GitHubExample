package exceptions;

import java.io.IOException;

public class Program {

	
	public static void main(String[] args){
		ExceptionSuperClass eSupC = new ExceptionSuperClass();
		ExceptionSubClass eSubC = new ExceptionSubClass();
		eSupC.myExceptionMethod(100);
		
		try {
			eSupC.throwsMyException(20);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			eSupC.myExceptionMethod2(30);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		try {
			eSupC.throwsMixedException();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			eSubC.throwsMixedException();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			eSupC.throwsExceptionExample();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eSubC.throwsExceptionExample();
		
		
		eSupC.tryCatchExample();
		System.out.println("test");
		eSubC.tryCatchExample();
		System.out.println("test");
		
			
		
		
		try{
			eSupC.nfeMethod();
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		System.out.println("end");
		try{
			throwMyException(1000);
		}
		catch(MyException e){
			e.printStackTrace();
		}
		
		eSupC.myeMethod(1000);
		eSubC.myeMethod(500);
		*/
	}
	
	private static void throwMyException(int i) throws MyException{
		if(i>10)
			throw new MyException(i + " is veel te hoog!");
		else
			System.out.println("correct throw");
	}

}
