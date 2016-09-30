package overloading.staticmethods;

public class Program {

	public static void main(String[] args) {
		
		A.overloadedStatic(new B());
		B.overloadedStatic(new B());
		B.overloadedStaticOnlyA(new B());
		
		B[] array = {new B()};
		A.overloadedStatic(array);
		B.overloadedStatic(array);
		
		/*
		A a
		A a
		Only in A
		B...bs in A
		B[] bs in B
		 */

	}

}
