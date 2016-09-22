package collectionexamples.containsort;

import java.util.List;
import java.util.Set;

public class PetCollectionExampleMore extends PetCollectionExample {

	
	private static final boolean 	IS_TREESET = true;
	private static final boolean IS_HASHSET = false;
	
	public PetCollectionExampleMore(String[] names, int[] ages,
			Object[] petClasses) {
		super(names, ages, petClasses);
		
	}
	
	
	
	public void executeTreeExamplesRemove(){
		
		for(int i=0;i<petClasses.length;i++){
			try{
				if(petClasses[i] instanceof Pet){
					Pet pet = (Pet)petClasses[i];
					removePet(pet);
				}
				else if(petClasses[i] instanceof PetE){
					PetE pet = (PetE)petClasses[i];
					removePetE(pet);
				}
				else if(petClasses[i] instanceof PetC){
					PetC pet = (PetC)petClasses[i];
					removePetC(pet);
				}
				else if(petClasses[i] instanceof PetEC){
					PetEC pet = (PetEC)petClasses[i];
					removePetEC(pet);
				}	
				else if(petClasses[i] instanceof PetCE){
					PetCE pet = (PetCE)petClasses[i];
					removePetCE(pet);
				}	
				
			}
			catch(Exception e){
				System.out.println("failed selection");
			}			
		}
		
	}
	
	public void executeListExamplesRemove(){
		
		for(int i=0;i<petClasses.length;i++){
			try{
				if(petClasses[i] instanceof Pet){
					Pet pet = (Pet)petClasses[i];
					removeListPet(pet);
				}
				else if(petClasses[i] instanceof PetE){
					PetE pet = (PetE)petClasses[i];
					removeListPetE(pet);
				}
				else if(petClasses[i] instanceof PetC){
					PetC pet = (PetC)petClasses[i];
					removePetListC(pet);
				}
				else if(petClasses[i] instanceof PetEC){
					PetEC pet = (PetEC)petClasses[i];
					removePetListEC(pet);
				}	
				else if(petClasses[i] instanceof PetCE){
					PetCE pet = (PetCE)petClasses[i];
					removePetListCE(pet);
				}	
				
			}
			catch(Exception e){
				System.out.println("failed selection");
			}			
		}
		
	}
	
	
	public void removePetListCE(PetCE pet) {
		
		System.out.println(PET_CE);		
		List<PetCE> col = (List<PetCE>) returnList(names, ages, pet); 
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
		
		
	}



	public void removePetListEC(PetEC pet) {
		System.out.println(PET_EC);		
		List<PetEC> col = (List<PetEC>) returnList(names, ages, pet);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
		
	}



	public void removePetListC(PetC pet) {
		System.out.println(PET_C);		
		List<PetC> col = (List<PetC>) returnList(names, ages, pet);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
		
	}



	public void removeListPetE(PetE pet) {
		System.out.println(PET_E);		
		List<PetE> col = (List<PetE>) returnList(names, ages, pet);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
		
	}



	public void removeListPet(Pet pet) {
		System.out.println(PET);		
		List<PetE> col = (List<PetE>) returnList(names, ages, pet); 
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
		
	}



	public void removePet(Pet pet){
		System.out.println("**TreeSet Without equals/comparable**");
		Set<Pet> col= (Set<Pet>) returnSet(names, ages, pet,IS_TREESET,IS_HASHSET);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
	}
	
	public void removePetE(PetE pet){
		System.out.println("**TreeSet Equals(name)**");
		Set<PetE> col= (Set<PetE>) returnSet(names, ages, pet,IS_TREESET,IS_HASHSET);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
	}
	
	public void removePetC(PetC pet){
		System.out.println("**TreeSet Comparable(name)**");
		Set<PetC> col= (Set<PetC>) returnSet(names, ages, pet,IS_TREESET,IS_HASHSET);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
	}
	
	public void removePetEC(PetEC pet){
		System.out.println("**TreeSet Equals(name) Comparable(age)**");
		Set<PetEC> col= (Set<PetEC>) returnSet(names, ages, pet,IS_TREESET,IS_HASHSET);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
	}
	
	public void removePetCE(PetCE pet){
		System.out.println("**TreeSet Comparable(name) Equals(age)**");
		Set<PetCE> col= (Set<PetCE>) returnSet(names, ages, pet,IS_TREESET,IS_HASHSET);
		returnCollectionPets(col);
		System.out.println("Item removed? " + col.remove(pet));
		returnCollectionPets(col);
	}

}
