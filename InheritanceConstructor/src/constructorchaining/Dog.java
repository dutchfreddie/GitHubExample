package constructorchaining;

public class Dog extends Animal{

	static{System.out.println("Dog static init method");}
	
	{System.out.println("Dog init method");}
	
	
	public Dog(int i, String s) {
		super(i,s);
		Dog.constructorMethod();
	}
		

	public Dog() {
		super();
	}
	
	public Dog(int i){
		super(i);
	}
	
	

	public void doStuff(){
		System.out.println("vanuit de Dog Class");
		//h.doStuff();
		}
	
	public void doDogStuff(){
		System.out.println("do dog stuff");
		
	}	
	
	public static void constructorMethod(){
		System.out.println("static output Dog constructor");
	}
	
	public void returnNameAge(){
		System.out.println(getS() +  " " + getI());
	}
}
