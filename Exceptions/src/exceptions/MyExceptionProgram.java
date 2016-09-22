package exceptions;

public class MyExceptionProgram {
	
	private static int x;
	
	public static void main(String[] args){
		
		try{
			if(x==1)
				return;
			else				
				throw new MyException();
			
		}
		catch(MyExceptionSub e){
			System.out.println("from sub");
		}
		catch(MyException e){
			try{
				System.out.println("from super");
				throw new NullPointerException();
			}
			catch(NullPointerException ex){
				System.out.println("2");
				return;
			}			
		}
		
		finally{
			try {
				System.out.println("from finally");
				throw new Exception();
				
			} catch (Exception e) {
				System.out.println("from finally catch");
			}
		}
		System.out.println("The End");
	}

}
