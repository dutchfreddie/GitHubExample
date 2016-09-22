package inheritaceexample.overloading;

public abstract class AbstractAnimal {

	private String s;
	
	public AbstractAnimal(){
		
	}
	
	public AbstractAnimal(String s){
		this.setS(s);
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	public abstract void doStuff();
}
