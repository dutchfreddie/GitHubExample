package inheritanceexample.simpleexample;

public class A {


	private int x;
	
	public A(){System.out.println("from Constructor Class A");}
	
	public A(int x){this.x = x;}
	
	
	public void returnPrint(){
		System.out.println("class A");
	}
	
	protected void returnPrintProtected(){
	}
	
	public int returnInt(){return 1;}
	
	public A returnA(){return new A();}
	
}
