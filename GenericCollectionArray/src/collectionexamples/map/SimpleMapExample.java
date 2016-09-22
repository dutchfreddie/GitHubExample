package collectionexamples.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SimpleMapExample {

	public static void main(String...strings){
		int[] values = {44,43,80,40,1,38,1,43};
		String[] keys = {"fred","isa","fred","marc","max","mich","Robin","isa"};
		int x=1;
		System.out.println("Original\nGrootte: " + values.length);
		
		
		for(int i=0;i<values.length;i++){
			System.out.println(x + "\t" + values[i] + "\t" + keys[i]);
			x++;
		}
		System.out.println();
		
		
		Map<String,Integer> hMap = new HashMap<>();
		Map<String,Integer> tMap = new TreeMap<>();
		for(int i=0;i<keys.length;i++){
			hMap.put(keys[i], new Integer(values[i]));
			tMap.put(keys[i], new Integer(values[i]));
		}
		System.out.println("HashMap");
		System.out.println("grootte: " + hMap.size());
		x=1;
		for(Map.Entry<String, Integer> entry:hMap.entrySet()){
			System.out.print(x + "\t");printOutEntry(entry);
			x++;
		}
		System.out.println("\nTreeMap");
		System.out.println("grootte: " + tMap.size());
		Iterator<Entry<String, Integer>> it = tMap.entrySet().iterator();
		x=1;
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.print(x + "\t");printOutEntry(entry);
			x++;
		}
		
		System.out.println("\nSorting hashmap on key: ");
		Set<Entry<String,Integer>> hSet = hMap.entrySet();
		List<Entry<String,Integer>> nList = new LinkedList<>(hSet);
		Collections.sort(nList,new ValueComparator());
		for(Entry<String,Integer> entry:nList){
			printOutEntry(entry);
		}
	}
	
	static void hashmapTreemapExample(){
		int[] values = {44,43,80,40,1,38,1,43};
		String[] keys = {"fred","isa","fred","marc","max","mich","Robin","isa"};
		int x=1;
		System.out.println("Original\nGrootte: " + values.length);
		
		
		for(int i=0;i<values.length;i++){
			System.out.println(x + "\t" + values[i] + "\t" + keys[i]);
			x++;
		}
		System.out.println();
		
		
		Map<String,Integer> hMap = new HashMap<>();
		Map<String,Integer> tMap = new TreeMap<>();
		for(int i=0;i<keys.length;i++){
			hMap.put(keys[i], new Integer(values[i]));
			tMap.put(keys[i], new Integer(values[i]));
		}
		System.out.println("HashMap");
		System.out.println("grootte: " + hMap.size());
		x=1;
		for(Map.Entry<String, Integer> entry:hMap.entrySet()){
			System.out.print(x + "\t");printOutEntry(entry);
			x++;
		}
		System.out.println("\nTreeMap");
		System.out.println("grootte: " + tMap.size());
		Iterator<Entry<String, Integer>> it = tMap.entrySet().iterator();
		x=1;
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.print(x + "\t");printOutEntry(entry);
			x++;
		}
		
		System.out.println("\nSorting hashmap on key: ");
		Set<Entry<String,Integer>> hSet = hMap.entrySet();
		List<Entry<String,Integer>> nList = new LinkedList<>(hSet);
		Collections.sort(nList,new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		
		
		for(Entry<String,Integer> entry:nList){
			printOutEntry(entry);
		}
		
		
		
		
	}	
	
	static void printOutEntry(Map.Entry<?, ?> entry){
		System.out.println(entry.getKey() + "\t" + entry.getValue());
	}	
}

class ValueComparator implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}
	
}
