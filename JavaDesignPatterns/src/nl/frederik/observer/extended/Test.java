package nl.frederik.observer.extended;

public class Test implements ITest {

	private String name;
	
	public Test(String name){
		this.name=name;
	}
	
	@Override
	public String toUpperCase() {
		// TODO Auto-generated method stub
		return name.toUpperCase();
	}

}
