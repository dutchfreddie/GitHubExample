package equalshashcode.main;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		hashsetEqualsExample();	
		
	}
	
	static void hashsetEqualsExample(){
		
		int[] ages = {1,3,3,4,1,2};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		Set<A> people = new LinkedHashSet<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);
		}
		System.out.println(people.toString());
		
		A newA= new A(3,"moeke");
		System.out.println(people.size());
		//System.out.println(people.contains(newA));
		//System.out.println(people.remove(newA));
		//System.out.println(people.size());
		
		for(A a:people){
			System.out.println(a.getAge() + a.getName());
		}
	}
	
	static void arrayListEqualsExample(){
		int[] ages = {1,3,3,4,1,2};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		List<A> people = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			A a = new A(ages[i],names[i]);
			people.add(a);
		}
		System.out.println(people.toString());
		
		A newA= new A(3,"moeke");
		System.out.println(people.size());
		System.out.println(people.contains(newA));
		System.out.println(people.remove(newA));
		System.out.println(people.size());
		
		for(A a:people){
			System.out.println(a.getAge() + a.getName());
		}
	}
	
	static void simpleEqualsExample(){
		A so = new A(20, null);
		System.out.println(so.toString());
		System.out.println(so);
		A so2 = so;
		System.out.println(so2.toString());
		System.out.println(so2);
		
		A so3 = new A(22, null);
		System.out.println(so3.toString());
		System.out.println(so3);		
		System.out.println(so2==so);
		System.out.println(so2.equals(so));
		System.out.println(so3==so3);
		System.out.println(so3.equals(so));
		System.out.println(so3.hashCode());
		
		
		System.out.println();
		String s1 = new String("a");
		String s2 = new String("a");
		s2 = s2.concat("b");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s1);
		System.out.println(s1.equals(s2));
	}

}
