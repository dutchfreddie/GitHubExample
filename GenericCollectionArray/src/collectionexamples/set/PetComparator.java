package collectionexamples.set;

import java.util.Comparator;

public class PetComparator implements Comparator<PetC> {

	@Override
	public int compare(PetC p1, PetC p2) {
		// TODO Auto-generated method stub
		return p1.getName().compareTo(p2.getName());
	}

	

}
