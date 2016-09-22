package innerclassexamples.regularinnerclass;

public class RegularOuterClass {
	
	class RegularInnerClass{
		
		void methodRegularInnerClass(){
			
		}
	}	
	
	interface  RegularInnerInterface{
	
		void methodRegularInnerInterface();
	}
	
	void methodRegularOuterClass(){
		RegularInnerClass ric = new RegularInnerClass();
		ric.methodRegularInnerClass();
	}
	
	
	static class StaticNestedClasss{
		
		void methodStaticNestedClass(){
			
		}
		
		static void staticMethodStaticNestedClass(){
			
		}
		
	}
	
	void methodRegularOuterClass2(){
		StaticNestedClasss snc = new StaticNestedClasss();
		snc.methodStaticNestedClass();
		StaticNestedClasss.staticMethodStaticNestedClass();
	}


}
