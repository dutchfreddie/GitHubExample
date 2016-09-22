package collectionwrapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrayInt = {1,2,3,4};
		List<Integer> listInt = new ArrayList<Integer>();
		for(int i:arrayInt){
			listInt.add(i);
		}
		
	}

}
