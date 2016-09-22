package constructorexample.vararg;

public class Program {

	public static void main(String[] args) {
		
		VarargTest vt = new VarargTest("", new int[]{1,2});
		
		VarargTest vt2 = new VarargTest("", 12,3,5,6);
		vt2.printOut();
		
	
		
	}

}
