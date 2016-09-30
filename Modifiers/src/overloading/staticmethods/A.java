package overloading.staticmethods;

import java.util.List;

public class A{

	protected static void overloadedStatic(A c){
		System.out.println("A a");
	}
	
	public static void overloadedStatic(B...bs){
		System.out.println("B...bs in A");
	}	
	
	public static void overloadedStaticOnlyA(A a){
		System.out.println("Only in A");
	}

}
