package collectionexamples.nongeneric;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		//list.add("1");
		for(Object o:list){
			System.out.println(o);
		}
		for(int i=0;i<list.size();i++){
			try{
				Integer integer = (Integer)list.get(i);
				System.out.println("element " + i + " is een integer");
			}
			catch(Exception e){
				System.out.println("element " + i + " is NOT een integer");
				e.printStackTrace();
			}
		}

	}
	
	static void nongenericExample(){
		List list = new ArrayList();
		list.add(1);
		list.add("1");
		for(Object o:list){
			System.out.println(o);
		}
		for(int i=0;i<list.size();i++){
			try{
				Integer integer = (Integer)list.get(i);
				System.out.println("element " + i + " is een integer");
			}
			catch(Exception e){
				System.out.println("element " + i + " is NOT een integer");
				e.printStackTrace();
			}
		}
	}

}
