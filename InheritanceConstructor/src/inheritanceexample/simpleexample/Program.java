package inheritanceexample.simpleexample;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Animal aa = new Animal();
		aa.doStuff();
		Animal.doStuff();
		Animal ab = new Horse();
		ab.doStuff();
		Horse.doStuff();
	}
	
	private static void examples(){
	A a1 = new A();
		a1.returnPrint();
		B b1 = new B();
		b1.returnPrint();
		b1.returnPrintFromB();
		
		A ab1 = new B();
		ab1.returnPrint();
		//ab1.returnPrintFromB();
		
		A a2 = b1;
		B b2 = (B)a2;
		a2.returnPrint();
		b2.returnPrint();
		
		Object o1 = a1;
		A a3 = (A)o1;
		a3.returnPrint();
		
		Object o2 = ab1;
		B b3 = (B)o2;
		A a4 = (A)o2;
		b3.returnPrint();
		b3.returnPrintFromB();
		a4.returnPrint();
	}



	private static void examples2(){
		A a1 = new A();		
		Object oa1 = a1;
		A a2 = (A)oa1;
		a2.returnPrint();
		//B b2 = (B)oa1;
		System.out.println("");
		B b1 = new B();
		Object ob1 = b1;
		B b2= (B)ob1;
		A a3= (A)ob1;
		b2.returnPrint();
		b2.returnPrintFromB();
		a3.returnPrint();
		//a3.returnPrintFromB();
		System.out.println("");
		A ab = new B();
		Object oab = ab;		
		B b = (B)oab;
		A a = (A)oab;
		b.returnPrint(); b.returnPrintFromB();
		a.returnPrint();
		
		A a5 = new A();
		B b5 = (B)a5;
		B b6 = new B();
		A a6 =(A) b6;
	
	}
}
