package collectionexamples;

import java.util.Comparator;

public class YearSort implements Comparator<DVDInfo>{

	

	public int compare(DVDInfo one,DVDInfo two) {
		Integer oneI = new Integer(one.getYear());
		Integer twoI = new Integer(two.getYear());
		
		return oneI.compareTo(twoI);
		//return one.getYear().compareTo(two.getYear());
	}
	
}
