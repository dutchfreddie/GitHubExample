package literalsexample.operators;

import java.awt.Dimension;

public class Program {

	public static void main(String[] args) {
		
		primitiveComparison();
		
	}
	
	private static void primitiveComparison(){
		boolean myBool = false; // line 1
		int yourInt = 10; // line 2
		float hisFloat = 19.54f; // line
		
		System.out.println(hisFloat > yourInt); // line 4
		System.out.println(yourInt = 10); // line 5
		System.out.println(myBool = false);
		
		
		
		double a5 = 10;
		int num1 = 12; // line 3
		float num2 = 17.8f; // line 4
		boolean eJavaResult = true; // line 5
		boolean returnVal = (num1 >= 12) && (num2 < 4.567) // line 6
		|| (eJavaResult == true);
		System.out.println(returnVal); // line 7
		
		
		int a = 10;
		int b = 20;
		int c = 40;
		long l = 555;
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);
		System.out.println(++a >10);
		System.out.println(a++ >11 && ++b < 30);
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);// line1
		System.out.println(a > 90 && ++b < 30);
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);
		System.out.println(!(c>20) && a==10 );
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);
		System.out.println(a >= 99 || a <= 33 && b == 10);
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);
		System.out.println(a >= 99 && a <= 33 || b == 10);
		System.out.println("a: " + a + "\tb: " + b+"\tc: "+c);
	}
	
	private static void returnBoolean(boolean b){
		System.out.println(b);
	}
	
	static void output(SuperClass superC){
		if(superC instanceof SubClass)
			(superC).doStuff();
	}

	static void outputInterface(ISubClass isubC){
		isubC.doStuffInterface();
	}
	
	static void comparisonOperator(){
		// TODO Auto-generated method stub
				System.out.println("" + 5 + 6.5);
				System.out.println(5+6);
				
				int x = 0;
				System.out.println(++x);
				System.out.println(x++);
				System.out.println(++x);
				System.out.println(x);
				System.out.println("");
				int y = 0;
				System.out.println(y++==0);
				System.out.println(++y==2);
				
				int i1 = 0;
				int i2 = 0;
				if(i1++<1||++i1<4)
					System.out.println(i1);
				if(i2++>1&++i2<0)
					System.out.println(i2);
				System.out.println(i2);
	}
	
	static void equalityOperator(){
		int x = 6;
		long l = 16;
		float f = 6f;
		char c = 'a';
		if(x<l)
			System.out.println("true");
		if(x>f)
			System.out.println("true");
		if(x<c)
			System.out.println("true");
		if(x==f)
			System.out.println("true");
		Dimension d1 = new Dimension(10,10);
		Dimension d2 = new Dimension(10,10);
		Dimension d3 = d1;
		System.out.println("Dimension: " + (d1==d2));
		System.out.println("Dimension: " + (d3==d2));
		System.out.println("Dimension: " + (d1==d3));
		d3.height+=30;
		System.out.println("Dimension: " + (d1==d2));
		System.out.println("Dimension: " + (d3==d2));
		System.out.println("Dimension: " + (d1==d3));
		System.out.println(d1.height);
		System.out.println(d2.height);
		System.out.println(d3.height);
	}

	static void instanceofOperator(){
		SubClass subC = new SubClass();
		Object o = new Object();
		SuperClass superC = new SuperClass();
		SuperClass subCsuper = new SubClass();
		System.out.println((subC instanceof Object));
		System.out.println((o instanceof SubClass));
		System.out.println((subC instanceof SuperClass));
		System.out.println((superC instanceof SubClass));
		
		output(subCsuper);
		ISubClass isubC = new SubClass();
		outputInterface(isubC);
		
		SubClass cNull = null;
		System.out.println(cNull instanceof SubClass);
		SeperateClass sepC = new SeperateClass();
		//System.out.println((sepC instanceof SubClass));
	}
}
