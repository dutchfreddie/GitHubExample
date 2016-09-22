package collectionexamples.comparable;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

	@Override
	public int compare(Pet p1, Pet p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

	

}
