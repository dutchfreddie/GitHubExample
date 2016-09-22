package owngenericexample;

import java.util.List;

public class TestGeneric<T> {

	private T t;
	
	public TestGeneric (T t){
		this.t = t;
	}
	
	public T getT(){
		return t;
	}
	
	public void returnText(){System.out.println();}
	
	public static <T> void fill(List<T> list, T val){
		list.add(val);
	}
	
	
}
