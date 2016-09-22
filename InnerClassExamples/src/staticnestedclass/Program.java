package staticnestedclass;

import staticnestedclass.OuterClass.Nested;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		OuterClass oc = new OuterClass();
		Nested n = oc.returnNewNested(10);
		
		
		int x = OuterClass.X;
		
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
				
	}

}
