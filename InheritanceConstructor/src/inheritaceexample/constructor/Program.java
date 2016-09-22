package inheritaceexample.constructor;

public class Program {

	public static void main(String[] args) {
		
		ClassB b = new ClassB(100000l);
		//ClassB b2 = new ClassB(5,"");
		//ClassA ab = new ClassB(5,"");
		
		ClassA a = new ClassA(1000000l);
		ClassA a2 = new ClassA(5,"");

	}

}
