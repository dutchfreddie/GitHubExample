package wildcardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	
	public static void main(String...strings){
		example2();
	}
	
	
	private static void example2(){
		List<Integer> wildCardList = new ArrayList<Integer>();
		List<Object> emptyList = new ArrayList<Object>();
		
		for(int i=1;i<6;i++){
			wildCardList.add(i);
			emptyList.add(new Object());
		}
		
		Collections.copy(emptyList, wildCardList);
		System.out.println(emptyList.size());
		System.out.println();
		
		for(Object o:emptyList){
			Integer i = (Integer)o;
			System.out.println(o);
		}
		
	}
	
	private static void example(){
		List<Integer> wildCardList = new ArrayList<Integer>();
		wildCardList.add(new Integer(10));
		wildCardList.add(5);
		System.out.println(wildCardList);
		List<?> wCList = new ArrayList<Integer>(wildCardList);
		System.out.println(wCList);
		for(int i=0;i<wCList.size();i++){
			System.out.println(wCList.get(i));
		}
		
		for(Object o:wCList){
			if(o instanceof Long)
				System.out.println((Integer)(o));
		}
		
		List<Integer> listNR = new ArrayList<Integer>(wildCardList);
		for(Number n:listNR){
			System.out.println(n.longValue());
		}
		System.out.println("object");
		List<Object> listObject = new ArrayList<Object>();
		listObject.add(new Object());
		
		
		Collections.copy(listObject, wildCardList);
		
		System.out.println(listObject.toString());
		for(Object o:listObject){
			if(o instanceof Integer)
				System.out.println("part: " + o);
		}
		

		Collections.copy(listObject, wildCardList);		
		System.out.println(listObject.toString());
		for(Object o:listObject){
			if(o instanceof Integer)
				System.out.println("part: " + o);
		}
	}
	
}
