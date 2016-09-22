package collectionexamples.wildcards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCardExample {

	public static void main(String[] args) {
		
		
		//List<? super Animal> listAC = new ArrayList<Cat>();
		List<? super Animal> listA = new ArrayList<Object>();
		listA.add(null);
		//listA.add(new Object());
		listA.add(new Animal());
		listA.add(new Cat());
		int x=1;
		for(Object c:listA){
			if(c instanceof Object){
				System.out.println("element " + x + " is object " + c);
				if(c instanceof Cat){
					System.out.println("element " + x + " is cat " + c);
					((Cat) c).printOut();
				}
				else if(c instanceof Animal){
					System.out.println("element " + x + " is animal " + c);
					((Animal) c).printOut();
				}
				
				
			}
			
			else if(c==null){
				System.out.println("element " + x + " is null " + c);
			}
			x++;
		}
		
		
		//List<? extends Animal> listAO = new ArrayList<Object>();
		//listA.add(new Animal());
	}
	
	static void extendsWildCard(){
		List<String> listS = new ArrayList<>();
		listS.add("1");listS.add("2");
		List<? extends Object> listW = new ArrayList<String>(listS);
		listW.add(null);
		//listW.add("5");
		for(int i=0;i<listW.size();i++){
			String s = (String)listW.get(i);
			//Integer i2 = (Integer)listW.get(i);
			System.out.println(listW.get(i));
		}
		
		List<? extends Animal> listA = new ArrayList<Animal>();
		listA.add(null);
		
		//List<? extends Animal> listAO = new ArrayList<Object>();
		//listA.add(new Animal());
	}
	
	static void limitationsWildCard(){
		List<String> listS = new ArrayList<>();
		listS.add("1");listS.add("2");
		List<?> listW = new ArrayList<String>(listS);
		//listW.add("3");
		for(int i=0;i<listW.size();i++){
			String s = (String)listW.get(i);
			//Integer i2 = (Integer)listW.get(i);
			System.out.println(listW.get(i));
		}
		
		Iterator<?> iterator = listW.iterator();
		while(iterator.hasNext()){
			//Object obj = iterator.next();
			String s = (String)iterator.next();
			System.out.println(s);
			//Integer i = (Integer)iterator.next();
			
		}
		List<?> listW2 = new ArrayList<String>(listS);
		for(Object s:listW2){
			if(s instanceof String)
				System.out.println((String)s);
			else
				System.out.println("different type");
		}
		List<?> listWW = new ArrayList<>(listS);
		for(Object s:listWW){
			if(s instanceof Integer)
				System.out.println((String)s);
			else
				System.out.println("different type");
		}
	}

}
