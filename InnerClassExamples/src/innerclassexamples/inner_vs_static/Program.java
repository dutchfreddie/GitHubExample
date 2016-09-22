package innerclassexamples.inner_vs_static;



public class Program {

	public static void main(String[] args) {
		
		OuterClass.StaticConcreteClass scc = new OuterClass.StaticConcreteClass();
		//OuterClass.NonStaticConcreteClass nscc = new OuterClass.NonStaticConcreteClass();
		
		OuterClass oc = new OuterClass();
		OuterClass.NonStaticConcreteClass nscc = oc.new NonStaticConcreteClass();
		OuterClass.NonStaticConcreteClass nscc2 = new OuterClass().new NonStaticConcreteClass();

	}

}
