package exceptions;

public class SimpleProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1(0);

		
		
	}
	
	

	static void method1(int x){
		method2(x);
	}
	
	static void method2(int x){
		method3(x);		
	}
	
	static int method3(int x){
		
		return 10/x;
	}
	

}
