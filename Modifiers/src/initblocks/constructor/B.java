package initblocks.constructor;

public class B extends A {

	static{System.out.println("static init 1, class B");}
	{System.out.println("instance init 1, class B");}
	static{System.out.println("static init 2, class B");}
	
	public B(){
		System.out.println("constructor, class B");		
	}
	
	
	
}
