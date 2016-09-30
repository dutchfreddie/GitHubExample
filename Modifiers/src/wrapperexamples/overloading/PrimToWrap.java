package wrapperexamples.overloading;

public class PrimToWrap {

	void overload2(int i1,int i2){
		System.out.println("widening");
	}
	
	void overload2(Short i1,int i2){
		System.out.println("boxing");
	}
	
	void overload2(short... s){
		System.out.println("var-args");
	}
	
	void overload1(Short... i){
		System.out.println("widening and var-args");
	}
}
