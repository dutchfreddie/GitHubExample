package innerclassexamples.staticnested;

import java.util.Map;
import java.util.TreeMap;

class Program {

	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass(6);
		oc.methodOuterClass();
		
		OuterClass.StaticNestedClass snc = new OuterClass.StaticNestedClass(5);
		snc.accessOuterMethods();
		
		GenericOuterClass<String,String> goc = new GenericOuterClass<>();
		GenericOuterClass.Entry<String, String> entry;
		Map<String,String> map = new TreeMap<>();
		for(Map.Entry<String, String> mp:map.entrySet()){
			
		}
		
	}

}
