package collectionexamples.generic_class_methods;

public class GenericClassExample {

	public static void main(String[] args){
		Pair<String,Integer,Double> pairs = new Pair<>("",1,2d);
	}
}

class Pair<T1, T2,T3> {
	T1 object1;
	T2 object2;
	T3 object3;
	
	Pair(T1 one, T2 two,T3 three) {
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
}
