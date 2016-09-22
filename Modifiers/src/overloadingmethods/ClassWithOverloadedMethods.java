package overloadingmethods;

public class ClassWithOverloadedMethods {
	
	public static int y;
	private int x;
	private  static char c;

	static void go(int x){System.out.println("from int: " + x);}
	static void go(double x){System.out.println("from double: " + x);}
	static void go(long x){System.out.println("from long: " + x);}
	static void go(Integer x){System.out.println("from Integer: " + x);};
	
	static void go2(Integer b){System.out.println("from int: " + b);}
	//static void go2(int i){System.out.println("from int: " + i);}
	
	public static int method1(int y){
		int z;

		return c;

	}
}
