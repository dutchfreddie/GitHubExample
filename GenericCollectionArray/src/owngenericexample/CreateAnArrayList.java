package owngenericexample;

import java.util.List;

public class CreateAnArrayList {

	public <T> List<T> makeArrayList(List<T> t1, T t2) {
		
		t1.add(t2);
		
		return t1;
		
		
	}
	
	public static <T> void addList(List<T> list, T t2){
		list.add(t2);
	}
}
