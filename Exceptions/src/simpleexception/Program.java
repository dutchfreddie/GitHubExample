package simpleexception;

public class Program {

	public static void main(String[] args){
		String[] stringArray = {"1","2","3"};
		
		try{
			method1(stringArray);
		}
		catch(Exception e){
			System.out.println("Catched Error in main");
		}
	}

	private static void method1(String[] stringArray) {
		try{
			method2(stringArray);		
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catched error in method1");
		}
	}

	private static void method2(String[] stringArray) {
		for(int i = 0;i<5;i++){
			//try{
				System.out.println(stringArray[i]);		
			//}
			//catch(ArrayIndexOutOfBoundsException e){
				//System.out.println("catched error in method2: " + i);
			//}
		}
		System.out.println(stringArray[0]);
		
	}
	
}
