package collectionexamples.generic_class_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodsExample {

	public static void main(String[] args){
		List<String> list1 = new ArrayList<>();
		list1.add("3");list1.add("4");
		List<String> list2 = new ArrayList<>(list1);
		
		List<String> list1M = GenericMethod.fillWithStaticMethod(list1, "changed");
		GenericMethod gm = new GenericMethod();
		List<String> list2Mi= gm.fillWithNonStaticMethod2(list2, "5");
		
	}
	
}

class GenericMethod{
	
	public static <T> List<T> fillWithStaticMethod(List<T> list, T val) {
		for(int i = 0; i < list.size(); i++)
			list.set(i, val);
		return list;
	}
	
	public static List<String> fillWithStrings(List<String> list, String val) {
		for(int i = 0; i < list.size(); i++)
			list.set(i, val);
		return list;
	}	
	
	public <T> List<T> fillWithNonStaticMethod(List<T> list,T val){
		for(int i = 0; i < list.size(); i++)
			list.set(i, val);
		return list;
	}
	
	public <T,T2> List<T> fillWithNonStaticMethod2(List<T> list,T val){
		for(int i = 0; i < list.size(); i++)
			list.set(i, val);
		return list;
	}
}
