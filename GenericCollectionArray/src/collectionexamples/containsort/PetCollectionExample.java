package collectionexamples.containsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PetCollectionExample {
	
	protected String[] names;
	protected int[] ages;
	protected Object[] petClasses;
	
	protected static final String PET ="**Without equals/comparable**";
	protected static final String PET_C ="**Comparable(name)**";
	protected static final String PET_E ="**Equals(name)**";
	protected static final String PET_CE ="**Comparable(name) Equals(age)**";
	protected static final String PET_EC ="**Comparable(age) Equals(name)**";
	
	public PetCollectionExample(String[] names,int[] ages, Object[] petClasses){
		this.names=names;
		this.ages=ages;
		this.petClasses=petClasses;
	}
	
	public PetCollectionExample(String[] names, int[] ages) {
		this.names=names;
		this.ages=ages;
	}

	public void executeListExamples(){
		
		for(int i=0;i<petClasses.length;i++){
			try{
				if(petClasses[i] instanceof Pet){
					Pet pet = (Pet)petClasses[i];
					listPet(pet);
				}
				else if(petClasses[i] instanceof PetE){
					PetE pet = (PetE)petClasses[i];
					listPetEquals(pet);
				}
				else if(petClasses[i] instanceof PetC){
					PetC pet = (PetC)petClasses[i];
					listPetComparable(pet);
				}
				else if(petClasses[i] instanceof PetEC){
					PetEC pet = (PetEC)petClasses[i];
					listPetEqualsComparable(pet);
				}	
				else if(petClasses[i] instanceof PetCE){
					PetCE pet = (PetCE)petClasses[i];
					listPetComparableEquals(pet);
				}	
				
			}
			catch(Exception e){
				
			}			
		}
	}
	
	
	public void executeTreeExamples(){
		
		for(int i=0;i<petClasses.length;i++){
			
			try{
				if(petClasses[i] instanceof Pet){
					Pet pet = (Pet)petClasses[i];
					treeSetPet(pet);
				}
				else if(petClasses[i] instanceof PetE){
					PetE pet = (PetE)petClasses[i];
					//try{
						treeSetPetEquals(pet);	
					//}
					//catch(Exception e){
						
					//}
					
				}
				else if(petClasses[i] instanceof PetC){
					PetC pet = (PetC)petClasses[i];
					treeSetPetComparable(pet);
				}
				else if(petClasses[i] instanceof PetEC){
					PetEC pet = (PetEC)petClasses[i];
					treeSetPetEqualsComparable(pet);
				}
				else if(petClasses[i] instanceof PetCE){
					PetCE pet = (PetCE)petClasses[i];
					treeSetPetComparableEquals(pet);
				}	
			}
			catch(Exception e){
				System.out.println("failed");
			}
		}
	}
	
	public void executeHashSetExamples(){
		for(int i=0;i<petClasses.length;i++){
			try{
				if(petClasses[i] instanceof Pet){
					Pet pet = (Pet)petClasses[i];
					hashSetPet(pet);
				}
				else if(petClasses[i] instanceof PetE){
					PetE pet = (PetE)petClasses[i];
					hashSetPetEquals(pet);
				}
				else if(petClasses[i] instanceof PetC){
					PetC pet = (PetC)petClasses[i];
					hashSetPetComparable(pet);
				}
				else if(petClasses[i] instanceof PetEC){
					PetEC pet = (PetEC)petClasses[i];
					hashSetPetEqualsComparable(pet);
				}
				else if(petClasses[i] instanceof PetCE){
					PetCE pet = (PetCE)petClasses[i];
					hashSetPetComparableEquals(pet);
				}	
			}
			catch(Exception e){
				System.out.println("failed");
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public void listPet(Pet pet){
		
		System.out.println("**List without equals/comparable**");		
		List<Pet> col = (List<Pet>) returnList(names, ages, pet); 
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	@SuppressWarnings("unchecked")
	public void listPetEquals(PetE pet){
		
		System.out.println("**List with Equals(name)**");
		List<PetE> col= (List<PetE>) returnList(names, ages, pet);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
		//System.out.println("**Sorted List on Name**");	
		//Collections.sort(col);
	}
	
	public void listPetComparable(PetC pet){
		
		System.out.println("**List with Comparable(name)**");
		@SuppressWarnings("unchecked")
		List<PetC> col= (List<PetC>) returnList(names, ages, pet);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
		System.out.println("**Sorted List on Name**");
		Collections.sort(col);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void listPetEqualsComparable(PetEC pet){
		
		System.out.println("**List with Equals(name), Comparable(year)**");
		@SuppressWarnings("unchecked")
		List<PetEC> col= (List<PetEC>) returnList(names, ages, pet);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
		System.out.println("**Sorted List on Name**");
		Collections.sort(col);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void listPetComparableEquals(PetCE pet){
		
		System.out.println("**List with Equals(age), Comparable(name)**");
		@SuppressWarnings("unchecked")
		List<PetCE> col= (List<PetCE>) returnList(names, ages, pet);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
		System.out.println("**Sorted List on Name**");
		Collections.sort(col);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void treeSetPet(Pet pet){
		System.out.println("**TreeSet Without equals/comparable**");
		@SuppressWarnings("unchecked")
		Set<Pet> col= (Set<Pet>) returnSet(names, ages, pet,true,false);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	
	public void treeSetPetEquals(PetE pet){
		System.out.println("**TreeSet With equals(name)**");
		@SuppressWarnings("unchecked")
		Set<PetE> col= (Set<PetE>) returnSet(names, ages, pet,true,false);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void treeSetPetComparable(PetC pet){
		System.out.println("**TreeSet with Comparable(name)**");
		@SuppressWarnings("unchecked")
		Set<PetC> col= (Set<PetC>) returnSet(names, ages, pet,true,false);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));				
	}

	public void treeSetPetEqualsComparable(PetEC pet){
		System.out.println("**TreeSet With equals(name), comparable(year)**");
		@SuppressWarnings("unchecked")
		Set<PetEC> col= (Set<PetEC>) returnSet(names, ages, pet,true,false);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));	
	}	
	
	public void treeSetPetComparableEquals(PetCE pet){
		System.out.println("**TreeSet With equals(year), comparable(name)**");
		@SuppressWarnings("unchecked")
		Set<PetCE> col= (Set<PetCE>) returnSet(names, ages, pet,true,false);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));	
	}	
	
	public void hashSetPet(Pet pet){
		System.out.println("**HashSet Without equals/comparable(name)**");
		@SuppressWarnings("unchecked")
		Set<Pet> col= (Set<Pet>) returnSet(names, ages, pet,false,true);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void hashSetPetEquals(PetE pet){
		System.out.println("**HashSet with Equals(name)**");
		@SuppressWarnings("unchecked")
		Set<PetE> col= (Set<PetE>) returnSet(names, ages, pet,false,true);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	public void hashSetPetComparable(PetC pet){
		System.out.println("**HashSet with Comparable(name)**");
		@SuppressWarnings("unchecked")
		Set<PetC> col= (Set<PetC>) returnSet(names, ages, pet,false,true);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}
	
	
	public void hashSetPetEqualsComparable(PetEC pet){
		System.out.println("**HashSet with Equals(name) Comparable(Year)**");
		@SuppressWarnings("unchecked")
		Set<PetEC> col= (Set<PetEC>) returnSet(names, ages, pet,false,true);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}	
	
	public void hashSetPetComparableEquals(PetCE pet){
		System.out.println("**HashSet with Equals(year) Comparable(name)**");
		@SuppressWarnings("unchecked")
		Set<PetCE> col= (Set<PetCE>) returnSet(names, ages, pet,false,true);
		checkEquals(col, pet);		
		returnCollectionPets(col);
		System.out.println("list contains " + pet.getName() + " with contains()? " + col.contains(pet));		
	}	
	
	
	public void checkEquals(Collection<?> col, Object pet){
		if(pet instanceof Pet){
			Pet p = (Pet)pet;
			for(Object pc:col){
				Pet pc2 = (Pet)pc;
				if(pc2.equals(p)){
					System.out.println("equals TRUE with " + pc2.getName() + ", " + pc2.getYear());
				}
				else{
					System.out.println("equals FALSE with " + pc2.getName() + ", " + pc2.getYear());				
				}
			}			
		}
		else if(pet instanceof PetE){
			PetE p = (PetE)pet;
			for(Object pc:col){
				PetE pc2 = (PetE)pc;
				if(pc2.equals(p)){
					System.out.println("equals TRUE with " + pc2.getName() + ", " + pc2.getYear());
				}
				else{
					System.out.println("equals FALSE with " + pc2.getName() + ", " + pc2.getYear());				
				}
			}			
		}
		else if(pet instanceof PetC){
			PetC p = (PetC)pet;
			for(Object pc:col){
				PetC pc2 = (PetC)pc;
				if(pc2.equals(p)){
					System.out.println("equals TRUE with " + pc2.getName() + ", " + pc2.getYear());
				}
				else{
					System.out.println("equals FALSE with " + pc2.getName() + ", " + pc2.getYear());				
				}
			}			
		}
		else if(pet instanceof PetEC){
			PetEC p = (PetEC)pet;
			for(Object pc:col){
				PetEC pc2 = (PetEC)pc;
				if(pc2.equals(p)){
					System.out.println("equals TRUE with " + pc2.getName() + ", " + pc2.getYear());
				}
				else{
					System.out.println("equals FALSE with " + pc2.getName() + ", " + pc2.getYear());				
				}
			}			
		}
		else if(pet instanceof PetCE){
			PetCE p = (PetCE)pet;
			for(Object pc:col){
				PetCE pc2 = (PetCE)pc;
				if(pc2.equals(p)){
					System.out.println("equals TRUE with " + pc2.getName() + ", " + pc2.getYear());
				}
				else{
					System.out.println("equals FALSE with " + pc2.getName() + ", " + pc2.getYear());				
				}
			}			
		}
		
	}
	
	
	public List<?> returnList(String[] names, int[] ages, Object pet){
		if(pet instanceof Pet){
			List<Pet> col= new ArrayList<Pet>();
			
			for(int i=0;i<names.length;i++){
				Pet pc = new Pet(names[i], ages[i]);
				col.add(pc);
			}
			
			return col;
		}
		else if(pet instanceof PetE){
			List<PetE> col= new ArrayList<PetE>();
			
			for(int i=0;i<names.length;i++){
				PetE pc = new PetE(names[i], ages[i]);
				col.add(pc);
			}
			
			return col;
		}
		else if(pet instanceof PetC){
			List<PetC> col= new ArrayList<PetC>();
			
			for(int i=0;i<names.length;i++){
				PetC pc = new PetC(names[i], ages[i]);
				col.add(pc);
			}
			
			return col;
		}
		if(pet instanceof PetEC){
			List<PetEC> col= new ArrayList<PetEC>();
			
			for(int i=0;i<names.length;i++){
				PetEC pc = new PetEC(names[i], ages[i]);
				col.add(pc);
			}
			
			return col;
		}
		else if(pet instanceof PetCE){
			List<PetCE> col= new ArrayList<PetCE>();
			
			for(int i=0;i<names.length;i++){
				PetCE pc = new PetCE(names[i], ages[i]);
				col.add(pc);
			}
			
			return col;
		}
		
		
		return null;
	}
	
	public Set<?> returnSet(String[] names, int[] ages, Object pet, boolean isTreeSet, boolean isHashSet){
		if(isTreeSet){
			if(pet instanceof Pet){
				Set<Pet> col= new TreeSet<Pet>();
				
				for(int i=0;i<names.length;i++){
					Pet pc = new Pet(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetE){
				Set<PetE> col= new TreeSet<PetE>();
				
				for(int i=0;i<names.length;i++){
					PetE pc = new PetE(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetC){
				Set<PetC> col= new TreeSet<PetC>();
				
				for(int i=0;i<names.length;i++){
					PetC pc = new PetC(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetEC){
				Set<PetEC> col= new TreeSet<PetEC>();
				
				for(int i=0;i<names.length;i++){
					PetEC pc = new PetEC(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetCE){
				Set<PetCE> col= new TreeSet<PetCE>();
				
				for(int i=0;i<names.length;i++){
					PetCE pc = new PetCE(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
		}
		else if(isHashSet){
			if(pet instanceof Pet){
				Set<Pet> col= new HashSet<Pet>();
				
				for(int i=0;i<names.length;i++){
					Pet pc = new Pet(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetE){
				Set<PetE> col= new HashSet<PetE>();
				
				for(int i=0;i<names.length;i++){
					PetE pc = new PetE(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetC){
				Set<PetC> col= new HashSet<PetC>();
				
				for(int i=0;i<names.length;i++){
					PetC pc = new PetC(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetEC){
				Set<PetEC> col= new HashSet<PetEC>();
				
				for(int i=0;i<names.length;i++){
					PetEC pc = new PetEC(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
			else if(pet instanceof PetCE){
				Set<PetCE> col= new HashSet<PetCE>();
				
				for(int i=0;i<names.length;i++){
					PetCE pc = new PetCE(names[i], ages[i]);
					col.add(pc);
				}
				
				return col;
			}
		}
		
		
		return null;
	}

	
	public void returnCollectionPets(Collection<?> list){
		Object o = list.iterator().next();
		if(o instanceof PetE){
			for(Object p:list){
				PetE pc = (PetE)p;
				System.out.println(pc.getName() + " " + pc.getYear());
			}
		}
		else if(o instanceof PetC){
			for(Object p:list){
				PetC pc = (PetC)p;
				
				System.out.println(pc.getName() + " " + pc.getYear());
			}
		}
		else if(o instanceof PetEC){
			for(Object p:list){
				PetEC pc = (PetEC)p;
				
				System.out.println(pc.getName() + " " + pc.getYear());
			}
		}
		else if(o instanceof Pet){
			for(Object p:list){
				Pet pc = (Pet)p;
				
				System.out.println(pc.getName() + " " + pc.getYear());
			}
		}
		else if(o instanceof PetCE){
			for(Object p:list){
				PetCE pc = (PetCE)p;
				
				System.out.println(pc.getName() + " " + pc.getYear());
			}
		}
	}

}
