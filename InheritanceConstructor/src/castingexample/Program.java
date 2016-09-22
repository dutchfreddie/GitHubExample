package castingexample;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//A.m1();
		B1.m1();
		/*
		A a = new A();
		B1 b1 = new B1();
		B2 b2 =new B2();
		C1 c1 = new C1();
		
		A b1a = b1;
		b1a.returnString();
		
		
		b1.aClassReturn(a);
		b1.aClassReturn(b1);
		b1.aClassReturn(c1);
		b1.aClassReturn(b2);
		
		a.aClassReturnFromA(a);
		a.aClassReturnFromA(b1);
		a.aClassReturnFromA(c1);
		a.aClassReturnFromA(b2);
		
		b1.aClassReturnInB((B1) a);
		b1.aClassReturnInB(b1);
		b1.aClassReturnInB(c1);
		//b1.aClassReturnInB((B1)b2);
		 * */
		 
	}
	
	static void example(){
		B1 b = new B1();
		b.returnString();
		b.aClassReturn(b);
		A a2 = b;
		a2.returnString();
		b.objectReturn(a2);
		try{
			A a = new B1();
			B2 b2 = (B2)a;
			b2.returnString();
			b.objectReturn(b2);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		C1 c = new C1();
		b.objectReturn(c);
		
		try{
			A a3 = new B2();
			B2 b3 = (B2) a3;
			b3.returnString();
			b.objectReturn(b3);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		Object o = new A();
		A  b4 = (A)o;
		b4.returnString();
		
		//A a = new B1();
		//B2 a2 = (B2)a;
		//b.objectReturn(a);
		//b.objectReturn(a2);
		//B1 b2 = (B1) new A();
		//b.objectReturn(b2);
	}

}
