package collectionexamples.comparable;

import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) {
		int[] ages = {1,3,3,4,1,2};
		String[] names = {"fred","isa","fred","marc","max","michiel"};
		
		Set<Pet> pets = new TreeSet<Pet>();
		for(int i=0;i<ages.length;i++){
			Pet a = new Pet(ages[i],names[i]);
			pets.add(a);
		}
		for(Pet p:pets)
			System.out.println(p.getYear() + " " + p.getName());

	}

}
