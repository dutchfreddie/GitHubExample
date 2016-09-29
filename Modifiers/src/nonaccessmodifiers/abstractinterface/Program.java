package nonaccessmodifiers.abstractinterface;

public class Program {

	public static void main(String[] args) {
	
		A a = new A();
		a.varArgsM("5", 1,2,3,4);
		int[] array = {1,2,3,4};
		a.varArgsM("6", array);
		
		AbstractA absA = new A();
		
		
		
	}

}
