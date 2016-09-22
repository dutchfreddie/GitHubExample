package overriding.casting;

public class Program {

	public static void main(String[] args) {
		
		A1 a3 = new A3();
		System.out.println(a3 instanceof A1);
		System.out.println(a3 instanceof A2);
		System.out.println(a3 instanceof A3);
		System.out.println(a3 instanceof Object);
		Object oa3 = a3;
		System.out.println(oa3 instanceof A1);
		System.out.println(oa3 instanceof A2);
		System.out.println(oa3 instanceof A3);
		System.out.println(a3 instanceof Object);
		
		
		A1 aa1 = (A1) oa3;
		A2 aa2 = (A2)oa3;
		A3 aa3 = (A3)oa3;
		aa1.printIA1();aa2.printIA1();aa2.printIA2();aa3.printIA1();aa3.printIA2();
		
		
		IA2 ia2 = new A3();
		IA1 ia1ia2 = (IA1) ia2;
		ia1ia2.printIA1();
		System.out.println();
		
		A2 a2ia2 = (A2) ia2;
		a2ia2.printIA1();
		a2ia2.printIA2();
		
		int i = 99998500;
		float f = i;
		System.out.println(i - (int)f);
		float f2 = 320.8f;
		
		final short s = 1; // 1
		final char c = s; // 2
		
		
	}

}
