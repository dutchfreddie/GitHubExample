package collectionexamples.wildcards;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollectionsExample {

	public static void main(String[] args) {
		
		//List<Animal> listA = new ArrayList<Cat>();
		List<Cat> listA = new ArrayList<Cat>();
		
		Animal[] animal = new Cat[3];
		//Cat[] cats = (Cat[]) new Animal[3];
		String[] strings = (String[]) new Object[3];
		
	}

}
