package staticcollection.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		int[] ages = {10,20,3,20,5,6};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<A> people = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);	
		}
		A aOld = new A(20,"FFF");
		A aNew = new A(200,"GGG");
		Collections.replaceAll(people, aOld, aNew);
		
		for(A a:people){
			System.out.println(a.getAge() + " " + a.getName());
			
		}
		List<B> peopleB = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			B b = new B(ages[i],names[i]);
			peopleB.add(b);
		}
		
		B aOldB = new B(20,"isa");
		B aNewB = new B(200,"GGG");
		Collections.replaceAll(peopleB, aOldB, aNewB);
		
		for(B b:peopleB){
			System.out.println(b.getAge() + " " + b.getName());			
		}		
	}
	
	static void minMax(){
		int[] ages = {10,20,3,4,5,6};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<A> people = new ArrayList<>();
		Set<A> set = new TreeSet<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);
			set.add(a);
		}
		
		A found = Collections.min(people);
		A foundSet = Collections.min(set);
		System.out.println("List: " + found.getName() + "" + found.getAge());
		System.out.println("Set: " + foundSet.getName() + "" + foundSet.getAge());
		
		List<B> peopleB = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			B b = new B(ages[i],names[i]);
			peopleB.add(b);
		}
		
		
		//B foundB = Collections.min(peopleB);
		//System.out.println("List: " + found.getName() + "" + found.getAge());
	}
	
	static void binarySearch(){
		int[] ages = {1,9,10,20,4,5,6};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			list.add(ages[i]);
		}
		Collections.sort(list);
		int found = Collections.binarySearch(list, 25);
		
		System.out.println(found);
	}

}
