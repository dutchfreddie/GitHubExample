package literalsexample.boxingequals;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
	
		//wrappingExample();
		//boxingIntegerExample();
		Integer i1 = new Integer(120);
		Integer i2 = new Integer(120);
		
		Long l1 = new Long(120);
		printout(i1==i2) ;
		i1=120;
		i2=120;
		printout(i1==i2) ;		
		printout(l1.equals(i1));
		Short s1=120;
		Short s2=120;
		printout(s1==s2);
		Double l2 = 120d;
		Double l3= (double) 120;
		printout(l2==l3);
		printout(l2.equals(l1));
	}
	
	private static void  printout(boolean b){
		System.out.println(b);
	}

	static void boxingExample(){
		Integer i1 = new Integer(10);
		Integer i2 = 10;
		Integer i3 = i1;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i3);
		System.out.println(i1.equals(i3));
		Integer i4 = 10;
		Integer i5 = i4;
		System.out.println(i4);
		System.out.println(i5);
		i4 += 4;
		System.out.println(i4);
		System.out.println(i5);
		System.out.println();
		Boolean b1 = false;
		Boolean b2 = false;
		Boolean b3 = new Boolean("false");
		Boolean b4 = new Boolean(false);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b3==b4);
		System.out.println(b3.equals(b4));
	}

	static void boxingIntegerExample(){
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		Integer i3 = 1000;
		Integer i4 = 1000;
		int i5 = 1000;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println();
		System.out.println(i1==i4);		
		System.out.println(i1.equals(i4));
		System.out.println(i3==i5);		
		System.out.println(i3.equals(i5));
		System.out.println(i1==i5);		
		System.out.println(i1.equals(i5));
		System.out.println();
	}
	
	static void wrappingExample(){
		Integer i = 1;
		int i2 =i;
		i2 = i.intValue();		
		i = Integer.parseInt("5");
		Integer i4=Integer.getInteger("java.homexxxx", 5);
		Properties prop = System.getProperties();
		Set<Object> set = prop.keySet();
		for(Object obj:set){
			System.out.println(obj.toString());
		}
		
		for(Map.Entry<Object, Object> obj:prop.entrySet()){
			System.out.println(obj.getKey().toString() + "\t"+obj.getValue().toString());
		}
	}

}
