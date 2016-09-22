package setexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) {
		String[] names = {"xxx","freddie","isa","marc","laurent","fred","xx"};
		int[] ages = {5,42,41,37,69,42,1};
		Set<Pet> treePets= new TreeSet<Pet>();
		for(int i=0;i<names.length;i++){
			Pet pc = new Pet(names[i], ages[i]);
			treePets.add(pc);
		}
		
		Set<Pet> hashPets= new HashSet<Pet>();
		for(int i=0;i<names.length;i++){
			Pet pc = new Pet(names[i], ages[i]);
			hashPets.add(pc);
		}
		for(Pet p:treePets){
			System.out.println(p.getName() + "\t" + p.getYear());
		}
		System.out.println();
		for(Pet p:hashPets){
			System.out.println(p.getName() + "\t" + p.getYear());
		}
	}
	

}
