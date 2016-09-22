package constructorchaining;

public class Animal {

	private int i;
	private String s;
	private static final String NAME = "default";
	
	static{System.out.println("Animal static init method");}
	
	{System.out.println("Animal init method");}
	
	public Animal(){
		Animal.constructorMethod();
	}	
	
	
	public Animal(int i, String s) {
		this.i = i;
		this.s = s;
		constructorMethod();		
	}
	
	public Animal(int i){
		this(i,Animal.NAME);
	}

	public void doStuff(){
		System.out.println("vanuit de Animal Class");
		
	}
	
	public static void constructorMethod(){
		System.out.println("static output Animal constructor");
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}
	
	

	
}
