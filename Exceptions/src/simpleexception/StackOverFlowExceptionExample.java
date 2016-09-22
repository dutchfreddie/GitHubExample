package simpleexception;

public class StackOverFlowExceptionExample {
	public static void main(String args[]) {
		//myMethod();
		
		try {
			myMethod();
		}
		catch (StackOverflowError s) {
			for (int i=0; i<2; ++i){
				System.out.println(i);				
			}			
			//s.printStackTrace();
		}	
		System.out.println("end");
	}
		
	public static void myMethod() {
		myMethod();
	}
}
