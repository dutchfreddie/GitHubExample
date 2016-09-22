package inheritanceexample.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ClassA {
	
	public int y = 10;
	private int x;
	
	public static String z = "30";
	
	ClassA(){}
	
	ClassA(int x){this.x=x;}
	
	public void method1_A() throws MyException3, MyException2{
		
	}
	
	
	public void throwMyException(int x) throws MyException, MyException2{
		if(x==0)
			throw new MyException();
	}
	
	public void throwMyException2(int x) throws MyException{
		if(x==0)
			throw new MyExceptionSub();
	}
	
	public void throwNullPointerException(String s){
		if(s==null)
			throw new NullPointerException();
	}
	
	public void arrayException(int pos){
		int[] array = new int[5];
		int x = array[pos];
	}
	
	public void listException(int pos){
		List<Integer> list = new ArrayList<>();
		int x = list.get(pos);
	}

}
