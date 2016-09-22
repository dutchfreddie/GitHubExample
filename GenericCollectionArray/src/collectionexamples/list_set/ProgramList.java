package collectionexamples.list_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ProgramList {

	public static void main(String[] args) {
		
		
		Integer[] array = {1,-3,70,20,78,25};
		List<Integer> list =Arrays.asList(array);
		TreeSet<Integer> set = new TreeSet<>(list);
		int i = 0;
		System.out.println("ceiling\t" + set.ceiling(i));
		System.out.println("floor\t" + set.floor(i));
		System.out.println("higher\t" + set.higher(i));
		System.out.println("lower\t" + set.lower(i));
		for(Object o:set){
			System.out.println(o.toString());
		}
		System.out.println();
		NavigableSet<Integer> descendingTs = set.descendingSet();
		for(Object o:descendingTs){
			System.out.println(o.toString());
		}
		System.out.println();
		Iterator<Integer> di= set.descendingIterator();
		while(di.hasNext()){
			System.out.println(di.next());
		}
		System.out.println();
		Iterator<Integer> dis= descendingTs.descendingIterator();
		while(dis.hasNext()){
			System.out.println(dis.next());
		}
	}
	
	static void listExample(){
		List<String> list = new ArrayList<>();
		String[] array = {"1","2","3","4","5","6"};

		for(String s:array){
			list.add(s);
		}
		printOutList(list);
		System.out.println();
		String out = list.set(0, "500");
		System.out.println(out);
		printOutList(list);
	}
	
	static void printOutList(List<?> list ){
		for(Object o:list){
			System.out.println(o.toString());
		}
	}
	
	

}
