package wrapperexamples.overloading;

public class WrapToPrim {

	void overload2(int i1,int i2){
		System.out.println("boxing and widening");
	}
	
	void overload1(Short i1,int i2){
		System.out.println("boxing");
	}
	
	void overload2(short... s){
		System.out.println("boxing and var-args");
	}
	
	void overload1(Integer... i){
		System.out.println("var-args");
	}
}
