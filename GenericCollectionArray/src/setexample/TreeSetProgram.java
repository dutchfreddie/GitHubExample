package setexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		
		String[] names = {"xxx","freddie","isa","marc","laurent","fred","xx"};
		int[] ages = {5,42,41,37,69,42,5};	
		
		List<Pet> list= new ArrayList<Pet>();
		for(int i=0;i<names.length;i++){
			Pet pc = new Pet(names[i], ages[i]);
			list.add(pc);
		}
		
		Pet[] petArray = new Pet[list.size()];
		petArray = list.toArray(petArray);
		
		
		
	}
	
	private static void treeMapExample(){
		String[] names = {"xxx","freddie","isa","marc","laurent","fred","xx"};
		int[] ages = {5,42,41,37,69,42,5};		
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
		Map<Integer,String> examScoresHashMap = new HashMap<Integer,String>();
		
		for(int i=0;i<names.length;i++){
			examScores.put(ages[i],names[i]);
			examScoresHashMap.put(ages[i],names[i]);
		}	
		
		for(Entry<Integer, String> mp:examScores.entrySet())
			System.out.println(mp.getKey() + " " + mp.getValue());
		System.out.println();
		for(Entry<Integer, String> mp:examScoresHashMap.entrySet())
			System.out.println(mp.getKey() + " " + mp.getValue());
		
		System.out.println("The data in the map is: " + examScores);
		System.out.println("The data descending order is: " + examScores.descendingMap());
		System.out.println("Details of those who passed the exam: " +
		examScores.tailMap(40));
		System.out.println("The lowest mark is: " + examScores.firstEntry());
		
		
	}
	
	private static void examplesCollections(){
		String[] names = {"xxx","freddie","isa","marc","laurent","fred","xx"};
		int[] ages = {5,42,41,37,69,42,5};	
	
		List<String> asListList = Arrays.asList(names);
		System.out.println(Arrays.binarySearch(ages, 69));
		Arrays.sort(ages);
		System.out.println(Arrays.binarySearch(ages, 69));
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Set<Integer> set = new TreeSet<>();
		List<String> listS = new ArrayList<>();
		Set<String> setS = new TreeSet<>();
		
		for(int i=0;i<names.length;i++){
			list.add(ages[i]);set.add(ages[i]);listS.add(names[i]);setS.add(names[i]);list2.add(0);
		}
		System.out.println(Collections.binarySearch(list, new Integer(37)));
		System.out.println(Collections.max(list) + " " + Collections.max(set));
		Collections.sort(list); Collections.sort(listS);		
		System.out.println(Collections.binarySearch(list, new Integer(37)));
		System.out.println(Collections.max(list) + " " + Collections.max(set));
		Collections.shuffle(list);
		System.out.println(Collections.binarySearch(list, new Integer(37)));
		Collections.copy(list2, list);
		System.out.println(list.size() + " " + list2.size());
		Collections.fill(list, 5);
		for(int i=0;i<names.length;i++){
			
			System.out.println(list.get(i) + " " + list2.get(i));
		}
	}
	
	private static void asListExample(){
		String[] names = {"xxx","freddie","isa","marc","laurent","fred","xx"};
		int[] ages = {5,42,41,37,69,42,5};	
		System.out.println(Arrays.binarySearch(ages, 69));
		Arrays.sort(ages);
		System.out.println(Arrays.binarySearch(ages, 69));
		List<String> asListList = Arrays.asList(names);
		//Collections.fill(asListList,"");
		Object[] newStringArray = asListList.toArray();
		String[] newStringArray2 = new String[newStringArray.length];
		for(int x=0;x<newStringArray.length;x++){
			newStringArray2[x] = (String) newStringArray[x];
		}
		System.out.println(newStringArray2[2]);
		
		String[] stringArray = new String[names.length];
		stringArray = asListList.toArray(stringArray);
		System.out.println(stringArray[2]);
	}

}
