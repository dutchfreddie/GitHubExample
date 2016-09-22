package inheritanceexample.simpleexample;

public class C {


	private String s;
	
	public C(){}
	public C(String s){this.s=s;}
	
	
	
	public A returnA(){return new A();}
	
	public static void returnPrintFromC(){System.out.println("from static C");}
}
