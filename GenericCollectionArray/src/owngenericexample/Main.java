package owngenericexample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric<String> test = new TestGeneric<String>("help");
		
		
		
		CreateAnArrayList cal = new CreateAnArrayList();
		List<String> list = new ArrayList<String>();
		list = cal.makeArrayList(list, "1");
		list = cal.makeArrayList(list, "2");
		
		for(String s2:list)
			System.out.println(s2);
		
		CreateAnArrayList.addList(list, "3");
		for(String s2:list)
			System.out.println(s2);
	}

}
