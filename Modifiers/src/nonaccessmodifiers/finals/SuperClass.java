package nonaccessmodifiers.finals;

public class SuperClass {
	
	public final void returnTextFinal(){
		System.out.println("final");
	}
	
	public void returnText(){
		System.out.println("not final");
	}

}
