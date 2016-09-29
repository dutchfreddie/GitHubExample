package initblocks.constructor;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		exampleAB();
		
	}
	
	private static void exampleA(){
		A a = new A();	
		/*
		static init 1, class A
		static init 2, class A
		instance init 1, class A
		constructor, class A
		 */
	}
	
	private static void exampleB(){
		B b = new B();	
		/*
		static init 1, class A
		static init 2, class A
		static init 1, class B
		static init 2, class B
		instance init 1, class A
		constructor, class A
		instance init 1, class B
		constructor, class B
		 */
	}
	
	private static void exampleAB(){
		A ab = new B();	
		/*
		static init 1, class A
		static init 2, class A
		static init 1, class B
		static init 2, class B
		instance init 1, class A
		constructor, class A
		instance init 1, class B
		constructor, class B
		 */
	}
	
	
	
	static void initExample(){
		SubInit subI = new SubInit(1);
		subI.returnText();
		SubInit subI2 = new SubInit(2);
		subI2.returnText();
		
	}

}
