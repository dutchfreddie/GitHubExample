package nonaccessmodifiers.finals;

public class SubClass extends SuperClass {
	
	public void returnText(){
		super.returnText();
		System.out.println("Extra Text");
	}	
	

}
