package initstaticexample;

public class A {
	
	private static int i =20;
	
	static{System.out.println("static init 1, class A");}
	{System.out.println("instance init 1, class A");}
	static{System.out.println("static init 2, class A");}
	
	static{i=60;}
	
	public A ()	{
		this.privateMethodA();
		i=70;
	}
	
	private void privateMethodA(){
		System.out.println("private methodA, class A from within the constructor");
	}
	
	public void publicMethodA(){
		System.out.println("public methodA, class A");
		System.out.println(i);
	}

}
