package innerclassexamples.inner_vs_static;

public class ProgramInterface {

	public static void main(String[] args) {
		
		OuterInterface.InnerClass oi_ic = new OuterInterface.InnerClass(5);
		OuterInterface.InnerInterface oi_ii = new OuterInterface.InnerInterfaceImpl(5);
		oi_ii.methodInnerInterface();

	}

}
