package collectionexamples.containsort;

import java.util.Comparator;

public class NaamPetComparator implements Comparator<Pet>{

	@Override
	public int compare(Pet arg0, Pet arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}

}
