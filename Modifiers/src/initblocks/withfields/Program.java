package initblocks.withfields;

public class Program {

public static void main(String[] args) {
		
		exampleAB();
		
	}
	
	private static void exampleA(){
		A a = new A();	
		/*
		static init 1, class A; i= 20
		static init 2, class A; i= 20
		instance init 1, class A; i= 60
		constructor, class A
		 */
	}
	
	private static void exampleB(){
		B b = new B();	
		/*
		static init 1, class A; i= 20
		static init 2, class A; i= 20
		static init 1, class B; i= 60
		static init 2, class B; i= 60
		instance init 1, class A; i= 60
		constructor, class A
		instance init 1, class B; i= 70
		constructor, class B
		 */
	}
	
	private static void exampleAB(){
		A ab = new B();	
		/*
		static init 1, class A; i= 20
		static init 2, class A; i= 20
		static init 1, class B; i= 60
		static init 2, class B; i= 60
		instance init 1, class A; i= 60
		constructor, class A
		instance init 1, class B; i= 70
		constructor, class B
		 */
	}

}
