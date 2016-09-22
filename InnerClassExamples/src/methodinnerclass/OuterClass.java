package methodinnerclass;

public class OuterClass {

	private int x = 7;
	
	public void methodInner(){
		
		final int y = 8;
		
		final class InnerClass{
			void returnX(){
				System.out.println(x);
				System.out.println(y);
				returnICFromOuterClass();
			}
			int changeY(){
				return y;
			}
		}
		
		InnerClass ic = new InnerClass();
		ic.returnX();
		returnICFromOuterClass();
	}
	
	public  void returnICFromOuterClass(){
		
	}

}
