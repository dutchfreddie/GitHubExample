package staticnestedclass;


public class OuterClass {

	static int X = 2;
	
	static int y2 = 3;
	
	abstract static class Nested{	
		
		private int y;
		
		public Nested(){
			
		}
		
		private Nested (int y){
			this.setY(y);
		}
		
		static void goNestedStatic(){
			System.out.println("go from Nested");
			System.out.println(X);
			System.out.println(y2);
		}
		
		abstract void goAbstractNested();
		
		private void goNested(){
			System.out.println("go from Nested");
			System.out.println(X);
			System.out.println(y2);
		}
		
		void goOuterClass(){
			OuterClass oc = new OuterClass();
			oc.methodOuterClass();
			OuterClass.staticMethodOuterClass();
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}
	
	static class ExtendedNested extends Nested{

		@Override
		void goAbstractNested() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	void methodOuterClass(){
		
	}
	
	static void staticMethodOuterClass(){
		
	}
	
	class InnerClass {}
	
	Nested returnNewNested(int y){
		ExtendedNested n = new ExtendedNested();
		n.goOuterClass();
		Nested.goNestedStatic();
		return n;
	}
}

class OuterTopClass{
	
	void accessNested(){
		
	}
}
