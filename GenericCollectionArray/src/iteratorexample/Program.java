package iteratorexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++)
		nums.add(i);
		System.out.println("Original list " + nums);
		Iterator<Integer> numsIter = nums.iterator();
		
		while(numsIter.hasNext()) {
			if(numsIter.next().equals(2))
				numsIter.remove();
		}
		System.out.println("List after removing all elements" + nums);
		ListIterator<Integer> numsListIterator = nums.listIterator();
		while(numsListIterator.hasNext()){
			Integer integer = numsListIterator.next();
			if(integer.equals(6)){
				//numsListIterator.remove();
				numsListIterator.set(new Integer(20));
			}
			
		}
		System.out.println("List after removing all elements" + nums);
		
		numsListIterator = nums.listIterator(5);
		while(numsListIterator.hasNext()){
			Integer integer = numsListIterator.next();
			System.out.println(integer);
			
		}
		System.out.println("List after removing all elements" + nums);
		
		numsListIterator = nums.listIterator(nums.size());
		while(numsListIterator.hasPrevious()){
			Integer integer = numsListIterator.previous();
			System.out.println(integer);
			
		}
		System.out.println("List after removing all elements" + nums);
	}
}
