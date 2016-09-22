package castingexample;

public class A {

	static{System.out.println("called static a");}
	
	public static  void m1(){
		System.out.println("m1 from A");
	}
	
	void returnString(){
		System.out.println("From A");
	}
	
	void aClassReturnFromA(Object o){
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
	
	void aClassReturnFromA(A o){
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
