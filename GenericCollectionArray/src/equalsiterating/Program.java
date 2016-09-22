package equalsiterating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		int[] ages = {1,2,3,4,5,6};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<A> people = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);
		}
		System.out.println("aantal in list: " + people.size());
		Iterator<A> iterator = people.iterator();
		while(iterator.hasNext()){
			A a = iterator.next();
			System.out.println(a.getAge() + " " + a.getName());
			if(a.getAge()==3)
				iterator.remove();
			
		}
		System.out.println("aantal in list: " + people.size());
		
		for(A a:people){
			System.out.println(a.getAge() + " " + a.getName());
			
		}
		
	}
	
	static void listIteratorListString(){
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<String> list = new ArrayList<>();
		Set<String> set = new TreeSet<>();
		
		for(int i=0;i<names.length;i++){			
			list.add(names[i]);
			set.add(names[i]);
		}
		System.out.println("aantal: " + list.size());
		ListIterator<String> listIteratorList = list.listIterator();
		while(listIteratorList.hasNext()){
			String a = listIteratorList.next();
			System.out.println(a);
			if(a.equals("fred")){
				//listIteratorList.remove();
				//listIteratorList.add("HHHH");
				listIteratorList.set("GGGG");
			}			
		}
		System.out.println("aantal: " + list.size());
		for(String a:list){
			System.out.println(a);
			
		}		
	}
	
	static void iteratorSetListPrimitives(){
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<String> people = new ArrayList<>();
		Set<String> set = new TreeSet<>();
		
		for(int i=0;i<names.length;i++){			
			people.add(names[i]);
			set.add(names[i]);
		}
		System.out.println("aantal: " + people.size());
		System.out.println("iterator");
		Iterator<String> iterator = people.iterator();
		while(iterator.hasNext()){
			String a = iterator.next();
			System.out.println(a);
			if(a.equals("fred")){
				iterator.remove();
			}
				
			
		}
		System.out.println("aantal: " + people.size());
		for(String a:people){
			System.out.println(a);
			
		}
		
		System.out.println("aantal in set: " + set.size());
		System.out.println("iterator");
		Iterator<String> iteratorSet = set.iterator();
		while(iteratorSet.hasNext()){
			String a = iterator.next();
			System.out.println(a);
			if(a.equals("fred"))
				iterator.remove();
			
		}
		System.out.println("aantal in set: " + set.size());
		for(String a:set){
			System.out.println(a);
			
		}		
	}
	
	
	
	static void arrayListEqualsExample(){
		int[] ages = {1,2,3,4,5,6};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<A> people = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);
		}
		System.out.println("iterator");
		Iterator<A> iterator = people.iterator();
		while(iterator.hasNext()){
			A a = iterator.next();
			System.out.println(a.getAge() + " " + a.getName());
			if(a.getAge()==3)
				iterator.remove();
			
		}
		
		
		System.out.println("listIterator");
		
		ListIterator<A> listIterator = people.listIterator();
		while(listIterator.hasNext()){
			A a = listIterator.next();
			System.out.println(a.getAge() + " " + a.getName());
			
		}
		
		
		System.out.println("listIterator-for");
		for(;listIterator.hasNext();){
			A a = listIterator.next();
			System.out.println(a.getAge() + " " + a.getName());
			if(a.getAge()==3)
				listIterator.remove();
			
		}
		
		
		
		System.out.println("forloop");
		
		for(int i=0;i<people.size();i++){
			A a = people.get(i);
			System.out.println(a.getAge() + " " + a.getName());
			
		}
		System.out.println("enhanced foor loop");
		
		for(A a:people){
			System.out.println(a.getAge() + " " + a.getName());
			
		}
		
	}
	
	
}
