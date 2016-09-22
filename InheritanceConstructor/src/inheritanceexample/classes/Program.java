package inheritanceexample.classes;

public class Program {

	public static void main(String[] args){
		
		AbstractClassImpl imp = new AbstractClassImpl("", "");		
		imp.nonAbstractDoStuff();
		imp.nonAbstractDoStuff2();
		
	}
}
