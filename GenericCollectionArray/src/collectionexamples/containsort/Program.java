package collectionexamples.containsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	
	
	public static void main(String[] args) {
		
		String[] names = {"fred","isa","marc","laurent","isa"};
		int[] ages = {42,41,37,69,20};
		
		int ageNew = 4;
		String nameNew="isa";
		
		Pet pNew = new Pet(nameNew,ageNew);
		PetE pcNew = new PetE(nameNew,ageNew);
		PetC pcompNew = new PetC(nameNew,ageNew);
		PetEC pecNew = new PetEC(nameNew,ageNew);
		PetCE pceNew = new PetCE(nameNew,ageNew);
		
		Object[] petClasses = {pNew,pcNew,pcompNew,pecNew,pceNew};
		
		
		Set<CatC> set = new TreeSet<CatC>();
		Set<PetC> setP = new TreeSet<PetC>();
		List<PetC> list = new ArrayList<>();
		List<Pet> listPets = new ArrayList<>();
		for(int i=0;i<names.length;i++){
			CatC c = new CatC(names[i],ages[i]);
			PetC p = new PetC(names[i],ages[i]);
			Pet pet = new Pet(names[i],ages[i]);
			
			list.add(p);
			listPets.add(pet);
		}
		
		
		
		
		int i = 1;
		for(PetC p:list){
			System.out.println(i + "\t" + p.returnName());
			i++;
		}
		System.out.println("");
		i=1;
		Collections.sort(list);
		for(PetC p:list){
			System.out.println(i + "\t" + p.returnName());
			i++;
		}
		PetC p = Collections.min(list);
		System.out.println(p.getName() + " " + p.getYear());
		PetC pS = new PetC("isa",20);
		int x = Collections.binarySearch(list, pS);
		System.out.println(x + " " + list.get(x).name + " " + list.get(x).year);
		
		Pet petS = new Pet("isa",20);
		
		x = Collections.binarySearch(listPets, petS,new NaamPetComparator());
		System.out.println(x + " " + listPets.get(x).getName() + " " + listPets.get(x).getYear());
	}
	
	private static void example(){
		
		String[] names = {"fred","isa","marc","laurent","isa"};
		int[] ages = {42,41,37,69,20};
		
		int ageNew = 4;
		String nameNew="isa";
		
		Pet pNew = new Pet(nameNew,ageNew);
		PetE pcNew = new PetE(nameNew,ageNew);
		PetC pcompNew = new PetC(nameNew,ageNew);
		PetEC pecNew = new PetEC(nameNew,ageNew);
		PetCE pceNew = new PetCE(nameNew,ageNew);
		
		Object[] petClasses = {pNew,pcNew,pcompNew,pecNew,pceNew};
		
		//PetCollectionExampleMore pce = new PetCollectionExampleMore(names, ages, petClasses);
				//pce.executeTreeExamplesRemove();
				//pce.executeListExamplesRemove();
				
				
				
				//pce.executeListExamples();
				//pce.executeTreeExamples();
				//pce.executeHashSetExamples();		
	}
	
	
}
