package constructorchaining;

public class Program {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		System.out.println();
		Dog d2 = new Dog();
		
	}
	
	private static void example1(){
		System.out.println("");
		Dog d = new Dog(12,"Frederik");
		d.doDogStuff();
		d.doStuff();
		Dog d2 = new Dog();
		d2.doDogStuff();
		Horse h = new Horse();
		h.doStuff();
		Dog d3 = new Dog(15);
		d3.returnNameAge();
	}

}
