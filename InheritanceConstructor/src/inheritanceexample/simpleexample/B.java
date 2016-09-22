package inheritanceexample.simpleexample;

public class B extends A {
	
	public B(int x){super(x);}
	public B(){System.out.println("from constructor Class B");}
	@Override
	public void returnPrint(){System.out.println("class B");}
	
	public void returnPrintFromB(){System.out.println("own class B");};
	
	@Override
	public void returnPrintProtected(){}
	
	@Override
	public int returnInt(){return (short)1;}
	
		
}
