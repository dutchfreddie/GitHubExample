package initstaticexample;

public class B extends A {

	static{System.out.println("static init 1, class B");}
	{System.out.println("instance init 1, class B");}
	static{System.out.println("static init 2, class B");}
	
	public B(){
		super();
		this.privateMethodB();
	}
	
	private void privateMethodB(){
		System.out.println("private methodA, class B from within the constructor");
	}
	
	@Override
	public void publicMethodA(){
		super.publicMethodA();
		System.out.println("public methodA, class B");
	}
	
	public void publicMethodB(){
		
		System.out.println("public methodB, class B");
	}
}
