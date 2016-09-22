package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	static void conversingArrayCollections(){
		List<Integer> iL = new ArrayList<Integer>();
		for(int x=0; x<3; x++)
		iL.add(x);
		Object[] oa = iL.toArray(); // create an Object array
		for(Object s:oa){
			System.out.println(s);
		}
		String[] two = (String[])oa;
		for(String s:two){
			System.out.println(s);
		}
		Integer[] ia2 = new Integer[3];
		ia2 = iL.toArray(ia2);
		for(int s:ia2){
			System.out.println(s);
		}
	}
	
	static void binarySearchExample(){
		String [] sa = {"one", "two", "three", "four"};
		Arrays.sort(sa); // #1
		for(String s : sa)
		System.out.print(s + " ");
		System.out.println("\none = "
		+ Arrays.binarySearch(sa,"one")); // #2
		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator(); // #3
		Arrays.sort(sa,rs);
		for(String s : sa)
		System.out.print(s + " ");
		System.out.println("\none = "
		+ Arrays.binarySearch(sa,"five")); // #4
		System.out.println("one = "
		+ Arrays.binarySearch(sa,"five",rs)); // #5	
	}
	
	static class ReSortComparator	implements Comparator<String> { // #6
	public int compare(String a, String b) {
	return b.compareTo(a); // #7
	}
	}
	
	
	static void sortComparableExample(){
		DVDInfo info1 = new DVDInfo("Help", "Popular", 1960);
		DVDInfo info2 = new DVDInfo("Apple", "Classical", 2010);
		DVDInfo info3 = new DVDInfo("Dune", "SF", 1985);
		List<DVDInfo> listDVD = new ArrayList<DVDInfo>();
		
		listDVD.add(info1); listDVD.add(info2); listDVD.add(info3);
		for(DVDInfo di:listDVD){
			System.out.println(di.toString());
		}
		Collections.sort(listDVD);
		
		for(DVDInfo di:listDVD){
			System.out.println(di.toString());
		}
		Collections.sort(listDVD,new YearSort());
		for(DVDInfo di:listDVD){
			System.out.println(di.toString());
		}
		Collections.reverse(listDVD);
		for(DVDInfo di:listDVD){
			System.out.println(di.toString());
		}
	}
	static void simpleCollection(){
		Set <Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		Set <Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set <Integer> treeSet = new TreeSet<Integer>();
		
		int[] intList = {1,2,88,77, 6,8,9,10};
		for(int i:intList){
			set.add(i); list.add(i); linkedHashSet.add(i); treeSet.add(i);
		}
		for(int i:set){
			System.out.println(i);
		}
		System.out.println();
		for(int i:linkedHashSet){
			System.out.println(i);
		}
		System.out.println();
		for(int i:list){
			System.out.println(i);
		}
		
		Collections.sort(list);
		System.out.println();
		for(int i:list){
			System.out.println(i);
		}
		System.out.println();
		for(int i:treeSet){
			System.out.println(i);
		}
	}

}
