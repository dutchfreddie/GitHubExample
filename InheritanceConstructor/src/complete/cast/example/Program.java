package complete.cast.example;

public class Program {

	public static void main(String[] args) {
		ClassA a = new ClassA();	
		ClassB b = new ClassB();	
		ClassA ab = new ClassB();
		
		UseAB use = new UseAB();
		use.method(a);
		use.method(b);
		use.method(ab);
		
		
		
	}
	
	private static void exampleCasting(){
		ClassA a = new ClassA();	
		ClassB b = new ClassB();	
		ClassA ab = new ClassB();		
		
		/*
		ClassB b2 =  (ClassB) a;			
		
		Object a_to_o = a;
		ClassB a_o_b = (ClassB) a_to_o;
		ClassC a_o_c = (ClassC) a_to_o;
		*/
		
		Object b_o = b;
		ClassA b_o_a =(ClassA) b_o;
		b_o_a.methodA();
		b_o_a.methodAB();
		
		ClassB b_o_b = (ClassB) b_o;
		b_o_b.methodA();
		b_o_b.methodAB();
		b_o_b.methodB();
	}
	
	private  static void exampleReferenceDeclaritive(){

	ClassA a = new ClassA();
	a.methodA();		
	a.methodAB();		
	
	ClassB b = new ClassB();
	b.methodA();
	b.methodAB();
	b.methodB();
	
	ClassA ab = new ClassB();
	ab.methodA();
	ab.methodAB();	
	}

}
