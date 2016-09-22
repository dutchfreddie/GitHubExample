package equalscomparable;

import java.util.Comparator;

public class PetClassComperator implements Comparator<PetClass> {

	@Override
	public int compare(PetClass o1, PetClass o2) {
		
		int retval = 0;
		if (o1 != null && o2 != null) {
			Integer id0 = new Integer( o1.getYear());
			Integer id1 =  new Integer( o2.getYear());
			retval =  id0.compareTo(id1);
		}
		return retval;

	}

	

}
