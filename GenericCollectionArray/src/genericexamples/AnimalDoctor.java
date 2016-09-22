package genericexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JButton;

public class AnimalDoctor {

	public void cdFromAnimalArray(Animal[] arrayAnimals){
		int x=1;
		for(Animal a:arrayAnimals){
			System.out.print(x + ": ");a.checkup();
			x++;
		}		
	}
	
	
	public void cdAnimalList(List<Animal> listAnimals){
		int x=1;
		for(Animal a:listAnimals){
			System.out.print(x + ": ");a.checkup();
			x++;
		}
	}
	
	public void cdGenericListExtendsAnimal(List<? extends Animal> listAnimals){
		for(Animal a:listAnimals){
			a.checkup();
		}
		for(Object o:listAnimals){
			
		}
		/*
		for(Cat c:listAnimals){
			
		}
		*/
	}
	
	public void cdGenericListSuperDog(List<? super Dog> listAnimals){
		for(Object a:listAnimals){
			((Animal) a).checkup();
		}
		/*
		for(Dog d:listAnimals){
			
		}
		*/
		
		
	}
	
	public void cdGenericListWildCard(List<?> listAnimals){
		for(Object a:listAnimals){
			((Animal) a).checkup();
		}
	}	
}
