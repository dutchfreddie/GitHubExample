package exceptionwithreturnvalue;

public class Program {

	public static void main(String[] args){		
		int z = returnXFromCatch(0);
		System.out.println(z);
		System.out.println(returnXFromTry(0));
		double d = returnDoubleX(-10, 0);
		System.out.println(d);
		  
	}
	
	private static int returnXFromCatch(int y){
		int val=10;
		try{
			int z = 20/y;			
		}
		catch(Exception e){
			return val;
			
		}
		finally{
			val+=10;
		}
		
		return val;
	}
	
	private static int returnXFromTry(int y){
		int val=10;
		try{
			int z = 20/y;	
			return val;
		}
		catch(Exception e){
			
			
		}
		finally{
			val+=10;
		}
		
		return val;
	}
	
	private static double returnDoubleX(double y1,double y2){
		double z=0;
		z = 1/(y1/y2);
		
		return z;
		
	}
}
