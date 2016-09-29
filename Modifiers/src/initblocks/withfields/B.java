package initblocks.withfields;

public class B extends A {

	static{System.out.println("static init 1, class B; i= " + i);consumeStaticM();}	
	{System.out.println("instance init 1, class A; i= " + i + "; j = " + j);}
	static{System.out.println("static init 2, class B; i= " + i);}
	
	public B(){
		//super();
		System.out.println("constructor, class B");	
	}
	
	public static void consumeStaticM(){
		System.out.println("consumeStaticM in B");
	}
	
}
