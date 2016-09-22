package collectionexamples.generic_class_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericClassMethod {

	public static void main(String[] args) {
		
		Pair2<String,Integer,Double> pairs = new Pair2<>("",1,2d);	
		List<Integer> list = new ArrayList<>();
		Pair2.genericMethod(list, 5);

	}

}

class Pair2<T1, T2,T3> {
	T1 object1;
	T2 object2;
	T3 object3;
	
	Pair2(){
		
	}
	
	Pair2(T1 one, T2 two,T3 three) {
		object1 = one;
		object2 = two;
		object3=three;
	}
	
	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}
	
	public T3 getThird(){
		return object3;
	}	
	
	static <T4> List<T4> genericMethod(List<T4> list,T4 t4){
		
		for(int i = 0; i < list.size(); i++)
			list.set(i, t4);
		return list;
	}
	
}
