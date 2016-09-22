package inheritanceexample.simpleexample;

public class D extends C {

	public D(){this.returnPrint();}
	
	public D(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	

	
	@Override
	public B returnA(){return new B();}
	
	private void returnPrint(){System.out.println("from method in D");}

}
