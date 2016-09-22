package castingexample;

public class B1 extends A {

	static{System.out.println("called static b");}
	{System.out.println("called init instance b");}
	
	
	public static  void m1(){
		System.out.println("m1 from B");
	}
		
	
	@Override
	void returnString(){
		System.out.println("From B1");
	}
	
	void objectReturn(Object o){
		if(o instanceof C1){
			C1 c = (C1) o;
			System.out.println("cast C1");
			c.returnString();	
		}
		else if(o instanceof A){
			A a = (A)o;
			System.out.println("cast A");
			a.returnString();
		}
		else if(o instanceof B1){
			B1 b = (B1)o;
			System.out.println("cast B1");
			b.returnString();
		}
		
	}
	
	void aClassReturn(A o){
		System.out.println("Start check");
		if(o instanceof C1){
			C1 c = (C1) o;
			System.out.println("cast C1");
			c.returnString();	
			o.returnString();
		}
		else if(o instanceof B1){
			B1 b = (B1)o;
			System.out.println("cast B1");
			b.returnString();
			o.returnString();
		}
		else if(o instanceof A){
			A a = (A)o;
			System.out.println("cast A");
			a.returnString();
			o.returnString();
		}
		
		
	}
	
	void aClassReturnInB(B1 o){
		System.out.println("Start check");
		if(o instanceof C1){
			C1 c = (C1) o;
			System.out.println("cast C1");
			c.returnString();	
		}
		else if(o instanceof B1){
			B1 b = (B1)o;
			System.out.println("cast B1");
			b.returnString();
		}
		else if(o instanceof A){
			A a = (A)o;
			System.out.println("cast A");
			a.returnString();
		}
		
		
	}
}
