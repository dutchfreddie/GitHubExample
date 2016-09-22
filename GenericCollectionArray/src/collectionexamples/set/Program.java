	package collectionexamples.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Program {

	public static void main(String[] args) {
		int[] ages = {44,43,80,40,1,38,1,43};
		String[] names = {"fred","isa","fred","marc","max","mich","robin","isa"};
		hashSetExample(ages, names);
		//treeSetExample(ages, names);
		
	}
	
	static void hashSetExample(int[] ages,String[] names){
		List<Pet> list = new ArrayList<>();
		
		Set<PetC> petC = new HashSet<PetC>();
		Set<PetCEH> petCEH = new HashSet<>();
		Set<PetEH> petEH = new HashSet<>();
		Set<PetE> petE = new HashSet<>();
		Set<PetH> petH = new HashSet<>();
		for(int i=0;i<ages.length;i++){
			Pet p = new Pet(names[i],ages[i]);
			list.add(p);
			try{
				PetC a = new PetC(names[i],ages[i]);
				petC.add(a);
			}
			catch(Exception e){
				PetCEH a2 = new PetCEH(names[i],ages[i]);
				petCEH.add(a2);
			}

			try{
				PetCEH a2 = new PetCEH(names[i],ages[i]);
				petCEH.add(a2);
			}
			catch(Exception e){
				
			}

			try{
				PetEH a3 = new PetEH(names[i],ages[i]);
				petEH.add(a3);
			}
			catch(Exception e){
				
			}

			try{
				PetE a4 = new PetE(names[i],ages[i]);
				petE.add(a4);
			}
			catch(Exception e){
				
			}

			try{
				PetH a5 = new PetH(names[i],ages[i]);
				petH.add(a5);
			}
			catch(Exception e){
				
			}			
		}
		
		System.out.println("HashSetExample");
		printOutList(list);
		printOutSet(petC,"C");
		printOutSet(petCEH,"CEH");
		printOutSet(petE,"E");
		printOutSet(petH,"H");
		printOutSet(petEH,"EH");
	}
	
	static void treeSetExample(int[] ages,String[] names){
		List<Pet> list = new ArrayList<>();
		
		Set<PetC> petC = new TreeSet<PetC>();
		Set<PetCEH> petCEH = new TreeSet<>();
		Set<PetEH> petEH = new TreeSet<>();
		Set<PetE> petE = new TreeSet<>();
		Set<PetH> petH = new TreeSet<>();
		for(int i=0;i<ages.length;i++){
			Pet p = new Pet(names[i],ages[i]);
			list.add(p);
			try{
				PetC a = new PetC(names[i],ages[i]);
				petC.add(a);
			}
			catch(Exception e){
				PetCEH a2 = new PetCEH(names[i],ages[i]);
				petCEH.add(a2);
			}

			try{
				PetCEH a2 = new PetCEH(names[i],ages[i]);
				petCEH.add(a2);
			}
			catch(Exception e){
				
			}

			try{
				PetEH a3 = new PetEH(names[i],ages[i]);
				petEH.add(a3);
			}
			catch(Exception e){
				
			}

			try{
				PetE a4 = new PetE(names[i],ages[i]);
				petE.add(a4);
			}
			catch(Exception e){
				
			}

			try{
				PetH a5 = new PetH(names[i],ages[i]);
				petH.add(a5);
			}
			catch(Exception e){
				
			}			
		}
		
		printOutList(list);
		printOutSet(petC,"C");
		printOutSet(petCEH,"CEH");
		printOutSet(petE,"E");
		printOutSet(petH,"H");
		printOutSet(petEH,"EH");
	}
	
	static void printOutList(List<Pet> list){
		System.out.println("List");
		System.out.println("Totaal aantal elements in List : " + list.size() + "\n");
		int x=1;
		for(Pet p:list){
			System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			x++;
		}
		System.out.println();
		
	}
	
	static void printOutSet(Set<?> set,String typeImple){
		System.out.println("InterfaceImpl in Set: " + typeImple);
		System.out.println("Totaal aantal elements in Set: " + set.size() + "\n");
		int x = 1;
		for(Object o:set){
			
			if(o instanceof Pet){
				Pet p = (Pet)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			else if(o instanceof PetH){
				PetH p = (PetH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			if(o instanceof PetE){
				PetE p = (PetE)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			if(o instanceof PetEH){
				PetEH p = (PetEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			if(o instanceof PetC){
				PetC p = (PetC)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			if(o instanceof PetCEH){
				PetCEH p = (PetCEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear());
			}
			x++;			 
		}
		System.out.println();
		
	}

}
