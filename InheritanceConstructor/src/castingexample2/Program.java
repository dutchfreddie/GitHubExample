package castingexample2;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		A a = new A();
		B1 b1 = new B1();
		A a2 = new B1();
		a.returnFromA();
		b1.returnFromA();
		a2.returnFromA();
		
		A.doStuff();
		B1.doStuff();
		
		A[] list = {new A(),new B1(),new C1(),new B2()};
		for(int i= 0;i<list.length;i++){
			list[i].doStuff();
			list[i].returnFromA();
		}
		
		
		
		C1 c1 = new C1();
		A ac1 = c1;
		
		c1.returnFromA();
		c1.returnFromB1();
		c1.returnFromC1();
		
		ac1.returnFromA();
		
		Object o = new A();
		o.toString();
		A ao = (A)o;
		ao.returnFromA();
		

	}

}
