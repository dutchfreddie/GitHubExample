package simpleexception;

public class ConstructorException {

	public static void main(String[] args){
		try {
			A a = new A(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class A{
	
	private int x;
	private int y;
	
	A(int x) throws Exception{
		if(x==0)
			throw new Exception();
		else
			this.x=x;
	}
	
	A(int x,int y){
		if(y==0)
			throw new NullPointerException();
		
	}
}
