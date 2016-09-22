package collectionexamples;

import java.util.Comparator;

public class PetClassYearSort implements Comparator<PetClass>{

	@Override
	public int compare(PetClass arg0, PetClass arg1) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(arg0.getYear());
		Integer i2 = new Integer(arg1.getYear());
		
		return i1.compareTo(i2);
	}
	
	

}
