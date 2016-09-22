package collectionexamples;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		petClassSetExample();
		
	}
	
	static void petClassSetExample(){
		PetClass[] arrayPetClass = {new PetClass("Frederik", 40), new PetClass("Isabelle", 39), 
				new PetClass("Michiel", 34),new PetClass("Marc", 36),new PetClass("Frederik", 41),new PetClass("Frederik",40)};
		Set<PetClass> treeSet = new TreeSet<PetClass>();
		Set<PetClass> hashSet = new HashSet<PetClass>();
		
		for(int i = 0;i<5;i++){
			treeSet.add(arrayPetClass[i]);
			hashSet.add(arrayPetClass[i]);
		}
		
		for (PetClass pc: treeSet){
			System.out.println(pc.getName() + "; " + pc.getYear());
		}
		System.out.println("");
		for (PetClass pc: hashSet){
			System.out.println(pc.getName() + "; " + pc.getYear());
		}
	}

}
