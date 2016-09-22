package overriding;

public class Program {

	public static void main(String[] args) throws Exception {
		
		IA1 a = new A1("test3");
		String s = null;
		String s2 = IA1.VAR;
		String s3 = a.VAR;
		System.out.println(s+s2+s3);
		
	}
	
	static void example3() throws Exception{
		A a = new A();
		B b = new B();
		
		a.printOutA();
		b.printOutA();
		b.printoutB();
		
		//B b2 = (B) a;
		A a2 = b;
		a2.printOutA();
		
		if(a2 instanceof A)
			System.out.println("A");
		if(a2 instanceof B)
			System.out.println("B");
			
		Object o = a2;
		A b3 = (B)o;		
	}
	
	
	int someMethod(String str){
		if(str == null) 
			throw new NullPointerException();
		else 
			return str.length();
		}
	
	private static void example(){
		A a1 = new A();
		Object obj = a1;
		if(obj instanceof A){
			System.out.println("yes");
		}
		A a2 = (A)obj;
		final A a3 = new A();
	
		//B b = (B) obj;
		//C c =(C)obj;
		B.staticReturn();
		A.staticReturn();
	}
	
	private static void example2(){
		int x = 5;
		float f = 5.5f;
		System.out.println(x==f);
		
		boolean b2 = false;
		int i = 1;
		do{
			System.out.println(b2);
			System.out.println(b2!=b2);
		i++ ;
		} while (b2 = !b2);
		System.out.println( i );
		
		A a4 = new A();
		try {
			a4.printOutA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		B b4 = new B();
		try {
			b4.printOutA();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		A a5 = new B();
		try {
			a5.printOutA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A a3 = null;
		B b3 = null;
		a3 = (A)b3;
		
		
		
		A[] a, a1;
		B[] b;
		a = new A[10]; a1 = a;
		b = new B[20];
		a = b; // 1
		b = (B[]) a; // 2
		b = (B[]) a1; // 3
	}

}
