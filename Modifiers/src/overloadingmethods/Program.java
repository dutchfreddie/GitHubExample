package overloadingmethods;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestStaticShadowing tss = new TestStaticShadowing();
		System.out.println(TestStaticShadowing.X);
		tss.changeStatic();
		System.out.println(TestStaticShadowing.X);
		double d = 10;
		tss.m((int)d);
		
		
		
		System.out.println((char)ClassWithOverloadedMethods.y);
		System.out.println(ClassWithOverloadedMethods.method1(20));
		
		
		
		
		/*
		from int: 5
		from int: 5
		from int: 5
		from long: 5
		from double: 5.0
		*/
		byte b = 5;
		
	}

	private static void  returnP(){
		
		
		byte b = 5;
		short s = 5;
		int i = 5;
		long l = 5;
		float f = 5.0f;
		Long l2 = new Long(i);
		Long l3 = (long) i;
		ClassWithOverloadedMethods.go(b);
		ClassWithOverloadedMethods.go(s);
		ClassWithOverloadedMethods.go(i);
		ClassWithOverloadedMethods.go(l);
		ClassWithOverloadedMethods.go(f);
		System.out.println(l2 + l3);
		
	}
}
