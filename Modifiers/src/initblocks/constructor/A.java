package initblocks.constructor;

public class A {
	
	static{System.out.println("static init 1, class A");}
	{System.out.println("instance init 1, class A");}
	static{System.out.println("static init 2, class A");}	
	
	public A ()	{
		System.out.println("constructor, class A");		
	}
	
	

}
