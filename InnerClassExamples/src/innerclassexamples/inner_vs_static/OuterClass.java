package innerclassexamples.inner_vs_static;

public class OuterClass {
	
	private int integerOuterClassField;
	private static int integerOuterClassStaticField;
	
	private void methodOuterClass(){
		NonStaticConcreteClass nscc = new NonStaticConcreteClass();
		StaticConcreteClass scc = new StaticConcreteClass();
	}
	
	private static void staticMethodOuterClass(){
		
	}
	
	private interface NonStaticInterface{
		void printOutOuterClassFields();
	}
	
	class NonStaticInterfaceImpl implements NonStaticInterface{

		@Override
		public void printOutOuterClassFields() {
			System.out.println(integerOuterClassField);
			System.out.println(integerOuterClassStaticField);
			methodOuterClass();
			staticMethodOuterClass();
			
		}
		
	}
	
	static class StaticConcreteClass implements StaticInterface{
		
		@Override
		public void printOutOuterClassFields() {
			//System.out.println(integerOuterClassField);
			System.out.println(integerOuterClassStaticField);
			//methodOuterClass();
			staticMethodOuterClass();
			
		}
	}
	
	abstract class NonStaticAbstractClass{
		
	}
	
	class NonStaticConcreteClass{
		
	}
	
	static interface StaticInterface {
		public void printOutOuterClassFields();
	}
	
	static abstract class StaticAbstractClass{
		
	}
	
	

}
