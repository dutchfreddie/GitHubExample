package listiteratorexample;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,3,6,7,8,9};
		
		List<Integer> list = Arrays.asList(array);
		System.out.println(list.size());
		ListIterator<Integer> li = list.listIterator(list.size());
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}

	}

}
