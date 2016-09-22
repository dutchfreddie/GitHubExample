package collectionexamples.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import collectionexamples.set.PetC;
import collectionexamples.set.PetCEH;
import collectionexamples.set.PetE;
import collectionexamples.set.PetEH;
import collectionexamples.set.PetH;
import collectionexamples.set.Pet;

public class PetMapExample {

	static List<Pet> pet = new ArrayList<>();
	static List<PetC> petC = new ArrayList<>();
	static List<PetCEH> petCEH = new ArrayList<>();
	static List<PetEH> petEH = new ArrayList<>();
	static List<PetE> petE = new ArrayList<>();
	static List<PetH> petH = new ArrayList<>();
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		int[] ages = {44,43,80,40,1,38,1,43,40};
		String[] names = {"fred","isa","fred","marc","max","mich","robin","isa","marc"};
		producePetLists(ages,names);		
		int[] values = {25,56,12,42,100,6,12,75,42};		
		
		Map<Pet,Integer> hMap = new HashMap<>();
		for(int i=0;i<ages.length;i++){
			try{
				hMap.put(pet.get(i), values[i]);
			}
			catch(Exception e){
				e.printStackTrace();
			}			
		}
		
		System.out.println("hashmap-size:" + hMap.size());		
		printOutPetMap(hMap);
		System.out.println();
		
		List linkedList = new LinkedList(hMap.entrySet());
		Collections.sort(linkedList,new Comparator(){

			@Override
			public int compare(Object arg0, Object arg1) {
				
				if((arg0 instanceof Pet)){
					
					
				}
				
				return 0;
			}
			
		});
		
	}
	
	static void exampleHashMapHashTree(){
		int[] ages = {44,43,80,40,1,38,1,43,40};
		String[] names = {"fred","isa","fred","marc","max","mich","robin","isa","marc"};
		producePetLists(ages,names);		
		int[] values = {25,56,12,42,100,6,12,75,42};
		
		
		
		Map<PetH,Integer> hMap = new HashMap<>();
		Map<PetEH,Integer> tMap = new TreeMap<>();
		for(int i=0;i<ages.length;i++){
			try{
				hMap.put(petH.get(i), values[i]);
			}
			catch(Exception e){
				e.printStackTrace();
			}

			try{
				//tMap.put(petEH.get(i), values[i]);
			}
			catch(Exception e){
				e.printStackTrace();
			}			
		}
		
		PetEH pchecking = new PetEH("fred", 44);
		int key = 56;
		if(hMap.size()>0){
			printOutBoolean(hMap.containsKey(pchecking));
			printOutBoolean(hMap.containsValue(key));	
		}
		if(tMap.size()>0){
			printOutBoolean(tMap.containsKey(pchecking));
			printOutBoolean(tMap.containsValue(key));	
		}
		
		
		System.out.println("List-Keys");
		printOutList(pet,values, "pet");
		System.out.println();
		System.out.println("hashmap-size:" + hMap.size());		
		printOutPetMap(hMap);
		System.out.println();
		System.out.println("treemap-size: " + tMap.size());
		printOutPetMap(tMap);
	}
	
	static void printOutBoolean(boolean b){
		System.out.println(b);
	}
	
	static void printOutPetMap(Map<?,Integer> map){
		int x=1;
		for(Map.Entry<?, Integer> entry:map.entrySet()){
			Integer i = entry.getValue();
			Object o = entry.getKey();
			if(o instanceof Pet){
				Pet p = (Pet)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			else if(o instanceof PetH){
				PetH p = (PetH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			else if(o instanceof PetE){
				PetE p = (PetE)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			else if(o instanceof PetEH){
				PetEH p = (PetEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			else if(o instanceof PetC){
				PetC p = (PetC)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			else if(o instanceof PetCEH){
				PetCEH p = (PetCEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + i);
			}
			x++;
		}
		
	}
	
	static void printOutList(List<?> set,int[] values,String typeImple){
		System.out.println("InterfaceImpl in List: " + typeImple);
		System.out.println("Totaal aantal elements in List: " + set.size() + "\n");
		int x = 1;
		for(Object o:set){
			
			if(o instanceof Pet){
				Pet p = (Pet)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t"+ values[x-1]);
			}
			else if(o instanceof PetH){
				PetH p = (PetH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t"+ values[x-1]);
			}
			if(o instanceof PetE){
				PetE p = (PetE)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + values[x-1]);
			}
			if(o instanceof PetEH){
				PetEH p = (PetEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + values[x-1]);
			}
			if(o instanceof PetC){
				PetC p = (PetC)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t "+ values[x-1]);
			}
			if(o instanceof PetCEH){
				PetCEH p = (PetCEH)o;
				System.out.println(x + "\t" + p.getName() + "\t" + p.getYear() + "\t" + values[x-1]);
			}
			x++;			 
		}
		System.out.println();
		
	}
	
	static void producePetLists(int[] ages,String[] names){
		
		
		for(int i=0;i<ages.length;i++){
			Pet p = new Pet(names[i],ages[i]);
			pet.add(p);
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
	}

}
