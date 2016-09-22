package collectionexamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Dog {
	public Dog(String n) { name = n; }
	public String name;
	
	public boolean equals(Object o) {
		if((o instanceof Dog) && (((Dog)o).name == name)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {return name.length(); }
	
}

class Cat { }

enum Pets {DOG, CAT, HORSE }

public class MapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void complexMapExample(){
		PetClass[] arrayPetClass = {new PetClass("Frederik", 40), new PetClass("Isabelle", 39), 
				new PetClass("Michiel", 34),new PetClass("Marc", 36),new PetClass("Frederik", 45)};
		String[] places = {"Utrecht","Pijnacker","Schiedam","Emmeloord", "Pijnacker"};
		Map<PetClass,String> treeMap = new TreeMap<PetClass,String>();
		Map<PetClass,String> hashMap = new HashMap<PetClass,String>();
		Map<PetClass,String> linkedHashMap = new LinkedHashMap<PetClass, String>();
		for(int i = 0;i<5;i++){
			treeMap.put(arrayPetClass[i], places[i]);
			hashMap.put(arrayPetClass[i], places[i]);
			linkedHashMap.put(arrayPetClass[i], places[i]);
		}
		System.out.println("looping through treemap");
		returnListMap(treeMap);
		System.out.println("");
		System.out.println("looping through hashMap");
		returnListMap(hashMap);
		System.out.println("");
		System.out.println("looping through linkedHashMap");
		returnListMap(linkedHashMap);
		System.out.println("");
		
		System.out.println(treeMap.containsKey(new PetClass("Frederik",41)));
		System.out.println(treeMap.get(new PetClass("Frederik",41)));
		System.out.println(hashMap.containsKey(new PetClass("Frederik",41)));
		System.out.println(hashMap.get(new PetClass("Frederik",41)));
		System.out.println(linkedHashMap.containsKey(new PetClass("Frederik",41)));
		System.out.println(linkedHashMap.get(new PetClass("Frederik",41)));
		
	}

	static void returnListMap (Map<PetClass,String> map){
		for(Map.Entry<PetClass, String> entry:map.entrySet()){
			String keyName= entry.getKey().getName();
			int keyYear = entry.getKey().getYear();
			String valuePlace = entry.getValue();
			System.out.println(keyName + "; " + keyYear +  "; " + valuePlace);
		}
	}
	static void simpleMapExample(){
		Map<Object, Object> m = new LinkedHashMap<Object, Object>();
		m.put("k1", new Dog("aiko")); // add some key/value pairs
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog d1 = new Dog("clover"); // let's keep this reference
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		for(Map.Entry<Object, Object> entry:m.entrySet()){
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "; " + value);
		}
		System.out.println("");
		
		
		Iterator it = m.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println(pairs.getKey() + " = " + pairs.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
		}
		
		System.out.println("");
		System.out.println(m.get("k1")); // #1
		String k2 = "k2";
		System.out.println(m.get(k2)); // #2
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); // #3
		System.out.println(m.get(d1)); // #4
		System.out.println(m.get(new Cat())); // #5
		System.out.println(m.size());

	}
	
}

