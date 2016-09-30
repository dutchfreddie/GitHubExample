package wrapperclass.instantation;

public class Program {

	public static void main(String...strings){
		fromValueOf();
	}
	
	static void fromPrimitives(){
		
		int i=1;
		byte b = 1;
		Byte by = (byte) i;
		Byte by2 = b;
		Integer ii = i;
		Integer iii = (int) b;
		
	}
	
	static void fromPrimitiveValues(){
		
		Integer i = 1000000000;
		Double d = (double) 1;
	}
	
	static void fromKeywordNew(){
		int i = 5;
		Byte by= new Byte((byte) 2.5);
		Byte by2 = new Byte((byte) i);
		Double lo2 = new Double(i);
		System.out.println(by);
		Long lo = new Long((long) 2.5);
		Double dlb = new Double(2.5454);
		Float fl = new Float(2.554);
		float f = 2.554f;
		short s = 20;
		Byte by3 = new Byte((byte) s);
		Integer i2 = new Integer(s);
	}
	
	static void fromValueOf(){
		int i = 50;short s = 50;long l=50;
		Integer in = Integer.valueOf(i);
		Integer in2 = Integer.valueOf(s);
		Integer in3 = Integer.valueOf((int)l);
		Long lo = Long.valueOf(i);
		
		String st = "23.4";
		//Integer in4 = Integer.valueOf(st, 10);
		System.out.println(Integer.getInteger(st));
	}
}
