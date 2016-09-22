package inheritanceexample.exceptions;

public class Program {

	public static void main(String[] args) {
		
		int k = 2;
		do{
		System.out.println(k);
		}while(k-->0);
		
		
		Program p = new Program();
		try {
			p.myTest();
		} catch (MyException3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	}
	
	public static void example1(){
	
		ClassB cab = new ClassB();
		
		try {
			cab.throwMyException(0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e){
			
		}		
	}
	
	private void myTest() throws MyException{
		throw new MyException3();
	}

}
