package equalscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		String[] names = {"fred","fred","marc","laurent"};
		int[] ages = {60,12,43,6};
		double[] sizes = {15,5,2.6,4};
		List<PetClass> list = new ArrayList<>();
		Set<PetClass> set = new TreeSet<>();
		for(int i=0;i<names.length;i++){
			PetClass pc = new PetClass(names[i],ages[i],sizes[i]);
			list.add(pc);
			//set.add(pc);
		}
		
		PetClass pcSearch = new PetClass("marc",43,2.6);
		
		System.out.println(list.contains(pcSearch)+ " " + set.contains(pcSearch));
		
		for(PetClass pc:list)
			returnPrint(pc);
		
		//for(PetClass pc:set)
			//returnPrint(pc);
		
		//Collections.sort(list,new PetClassComperator());
		//Collections.sort(list);
		for(PetClass pc:list)
			returnPrint(pc);
		
		//System.out.println(list.contains(pcSearch)+ " " + set.contains(pcSearch));
	}
	
	static void returnPrint(PetClass pc){
		System.out.println(pc.getName() + "\t " + pc.getYear() + "\t" + pc.getSize());
	}

}
