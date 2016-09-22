package innerclassexamples.localinnerclass;

public class OuterClass {

	static{
		abstract class AbstractInnerClass{			
			
			public abstract void methodAbstractInnerClass();
			
			private void methodNonAbstract(){
				
			}			
		}
		
		
		
		class InnerClass extends AbstractInnerClass{

			@Override
			public	void methodAbstractInnerClass() {
				// TODO Auto-generated method stub
				
			}				
		}
		
		InnerClass ic = new InnerClass();	
		
		class InnerClassFromInterface implements NonLocalInterface{

			@Override
			public void methodNonLocalInterface() {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	
	interface NonLocalInterface{
		void methodNonLocalInterface();
	}
	
	
	OuterClass(){
		class InnerClass{
			
		}
		InnerClass ic = new InnerClass();
	}
	private int x = 7;
	
	public void methodInnerClass(){
		class InnerClass{
			
		}
	}
	
	
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
