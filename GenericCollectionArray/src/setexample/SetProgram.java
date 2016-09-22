package setexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram {

	public static void main(String[] args) {
		
		example();
		
		
		

	}
	
	private static void example(){
		
		TreeSet<Cat> treeSet = new TreeSet<Cat>();
		Set<Cat> hashSet = new HashSet<Cat>();
		
		Cat c = new Cat("cat",30);
		Cat c2 = new Cat("cat",30);
		
		//treeSet.add(c);
		hashSet.add(c);
		
		//System.out.println(treeSet.contains(c2));
		System.out.println(hashSet.contains(c2));
		
		Cat[] array = hashSet.toArray(new Cat[hashSet.size()]);
	}

}
