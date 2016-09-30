package overloading.instancemethods;

import java.util.List;

public class A{

	public void overloaded(A c){
		System.out.println("A a");
	}
	
	public void overloaded(B...bs){
		System.out.println("B...bs in A");
	}
	
	public void overloaded(List<B> bs){
		System.out.println("B...bs");
	}

}
