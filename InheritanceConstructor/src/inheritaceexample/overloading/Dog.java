package inheritaceexample.overloading;

public class Dog extends Animal{

	public Dog(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public Dog() {
		
	}

	public void doStuff(){
		System.out.println("vanuit de Dog Class");
			}
	
	public void doDogStuff(){
		System.out.println("do dog stuff");
	}
	
	public Dog returnObject(){
		return new Dog(0);
	}
	
	
}
