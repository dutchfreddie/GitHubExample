package inheritaceexample.overloading;

public class Animal extends AbstractAnimal{

	private static int C = 1;
	private int i;
	
	public Animal(){}
	
	public Animal(String s){
		super(s);
	}
	
	public Animal(int i) {
		super();
		this.i = i;		
	}
	
	public void doStuff(){
		System.out.println("vanuit de Animal Class");
		
	}
	
	public Animal returnObject(){
		return new Animal(0);
	}
	
	public void returnString(){
		System.out.println(getS());
	}

	
}
