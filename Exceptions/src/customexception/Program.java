package customexception;

public class Program {

	public static void main(String[] args) {
		
	
		int[] sizeA = {1,2,3};
		int[] sizeB = {1,2};
		
		Demo d = new Demo(sizeA,sizeB);
		try {
			d.absCompare();
			//d.absCompare3();
		} catch (ASMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//d.absCompare2();
		
		

	}

}
