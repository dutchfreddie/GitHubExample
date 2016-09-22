package overloadingreference;

public class Program {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		A ab = new B();
		IA ia = new A();
		IA ib = new B();
		go(ia);
		
		

	}
	
	private static void go(A a){System.out.println("Entry A");a.returnAOnly();a.returnIA();}
	private static void go(IA a){System.out.println("Entry IA");a.returnIA();}
	private static void go(B b){System.out.println("Entry B");b.returnIA();b.returnAOnly();b.returnB();}
	private static void go(Object o){System.out.println("Entry Object");}

}
