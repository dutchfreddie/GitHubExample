package innerclassexamples.inner_vs_static;

public interface OuterInterface {
	
	int outerX=5;	
	
	void methodOuterInterface();
	
	public static interface InnerInterface{
		
		public static final int innerInterfaceX=5;
		
		public void methodInnerInterface();
	}
	
	public static class InnerInterfaceImpl implements InnerInterface{

		private int innerInterfaceImplX;
		
		public InnerInterfaceImpl(int innerInterfaceImplX){
			this.innerInterfaceImplX=innerInterfaceImplX;
		}
		
		@Override
		public void methodInnerInterface() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static class InnerClass{
		
		private int innerX;
		
		public InnerClass(int innerX){
			this.innerX=innerX;
		}
	}
	
	public static class InnerClassSub extends InnerClass{

		public InnerClassSub(int innerX) {
			super(innerX);
			// TODO Auto-generated constructor stub
		}
		
	}
}
