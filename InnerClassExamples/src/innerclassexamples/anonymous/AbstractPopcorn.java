package innerclassexamples.anonymous;

public abstract class AbstractPopcorn implements IPopcorn{

	public abstract void abstractPopup();
	
	public void concretePopup(){
		System.out.println("From concrete");
	}
	
}
