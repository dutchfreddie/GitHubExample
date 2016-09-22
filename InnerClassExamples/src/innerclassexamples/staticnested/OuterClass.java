package innerclassexamples.staticnested;

class OuterClass {

	private int yOuter;
	private static int yS_Outer;
	
	OuterClass(int yOuter){
		this.yOuter=yOuter;		
	}
	
	void methodOuterClass(){
		System.out.println(yS_Outer);
		System.out.println(yOuter);
	}
	
	static void staticMethodOuterClass(){
		System.out.println(yS_Outer);
	}
	
	public void accessPrivateSNC(){
		
	}
	
	static class StaticNestedClass{
		
		private int xNs_inner=200;
		
		StaticNestedClass(int xNs_inner){
			this.xNs_inner=xNs_inner;
		}
		
		void methodSNC(){
			//System.out.println(yOuter);
			System.out.println(yS_Outer);
		}
		
		void accessOuterMethods(){
			OuterClass oc = new OuterClass(5);
			oc.methodOuterClass();
			OuterClass.staticMethodOuterClass();
		}
	}
	
	private static class PrivateStaticNestedClass{
		
		private int xNs_inner;
		
		PrivateStaticNestedClass(int xNs_inner){
			this.xNs_inner=xNs_inner;
		}
		
		void methodSNC(){
			//System.out.println(yOuter);
			System.out.println(yS_Outer);
		}
		
		void accessOuterMethod(){
			OuterClass oc = new OuterClass(5);
			oc.methodOuterClass();
		}
	}
}
