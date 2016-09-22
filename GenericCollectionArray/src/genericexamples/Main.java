package genericexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//animalArrayMethod();
		//animalGenericExample();
		animalDogCatCollectionGenericMethod();
		
		
	}
	
	static void animalArrayMethod(){
		Animal[] animals = {new Dog(),new Cat(), new Dog()};
		Cat[] cats = {new Cat(),new Cat()};
		Dog[] dogs = {new Dog(), new Dog()};
		AnimalDoctor ad = new AnimalDoctor();
		ad.cdFromAnimalArray(animals);
		System.out.println();
		ad.cdFromAnimalArray(dogs);
		System.out.println();
		ad.cdFromAnimalArray(cats);
	}
	
	static void animalGenericExample(){
		Animal[] arrayAnimals = {new Dog(),new Dog(),new Cat(),new Animal()};			
		AnimalDoctor ad = new AnimalDoctor();
		List<Animal> list = Arrays.asList(arrayAnimals);
		ad.cdAnimalList(list);
	}  
	
	static void animalDogCatCollectionGenericMethod(){
		Dog[] dogArray = {new Dog(),new Dog(),new Dog()};
		List<Dog> listOfDogs = Arrays.asList(dogArray);
		AnimalDoctor ad = new AnimalDoctor();		
		
		List<Cat> listOfCats = new ArrayList<Cat>();
		listOfCats.add(new Cat()); listOfCats.add(new Cat());listOfCats.add(new Cat());
		
		List<Animal> listOfAnimals = new ArrayList<Animal>();
		listOfAnimals.add(new Cat()); listOfAnimals.add(new Dog());listOfAnimals.add(new Cat());
		
		System.out.println("Extended Animal");
		ad.cdGenericListExtendsAnimal(listOfAnimals);
		ad.cdGenericListExtendsAnimal(listOfDogs);
		ad.cdGenericListExtendsAnimal(listOfCats);
				
		System.out.println("WildCard"); 
		ad.cdGenericListWildCard(listOfAnimals);
		ad.cdGenericListWildCard(listOfDogs);
		ad.cdGenericListWildCard(listOfCats);
		
		System.out.println("SuperDog"); 
		ad.cdGenericListSuperDog(listOfAnimals);
		ad.cdGenericListSuperDog(listOfDogs);
		
		try{
			ad.cdAnimalList(listOfAnimals);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{
			///ad.cdAnimalList(listOfCats);
			//ad.cdAnimalLis(listOfDogs));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//ad.checkupDoctorGenericSuper(listOfCats);
		
		
		
	}
	
	
	
	static void simpleLegacyExample(){
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList);
		for(int i:myList){
			System.out.println(i);
		}
	}

}
