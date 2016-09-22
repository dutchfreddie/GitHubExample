package a_operator;

public class Program {

	public static void main(String[] args) {
		//divisonExamples();
		
		short s = 100;
		//implicitExplicitCastingExample(s);
		System.out.println("**********");
		//divisionByZeroInt(0);
		System.out.println("**********");
		divisionByZero(0);
		
	}
	
	static void implicitExplicitCastingExample(short s){
		//s=100
		int x = 1+s;
		byte b = (byte) (1+s);
		System.out.println(x + " " + b);//101 101
	}
	
	static void divisonExamples(){
		double d1 = (double)1/100*200;
		System.out.println(d1);//2.0
		
		double d1b = (double)(1/100*200);
		System.out.println(d1b);//0.0
		
		double d1c = 1/100*200;
		System.out.println(d1c);//0.0
		
		int i1 = 1/100*200;
		System.out.println(i1);//0	
		
	}
	
	static void divisionByZeroInt(int x){
		//x=0
		try{
			int i1 = (int) (1/x);	
			System.out.println(i1);			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		double d = 1/x;
		System.out.println(x);
		
		
	}
	
	static void divisionByZero(double x){
		
			int i1 = (int) (1/x);	
			int i2 = (int) (-1/x);	
			System.out.println(i1 + " " + i2);//2147483647 -2147483648
						
			byte b1 = (byte) (1/x);
			byte b2 = (byte) (-1/x);	
			System.out.println(b1 + " " + b2);//-1 0
			
			short s1 = (short) (1/x);
			short s2 = (short) (-1/x);	
			System.out.println(s1 + " " + s2);//-1 0
			
			long l1 = (byte) (1/x);
			long l2 = (long) (-1/x);	
			System.out.println(l1 + " " + l2);//9223372036854775807 -9223372036854775808
			
			System.out.println("**********");
		
		
		
		double d1 = 1/x;
		float f1 = (float) (1/x);
		
		System.out.println(d1 + " " + f1);//Infinity Infinity
		
		boolean bol1 = Float.isInfinite((float)d1);
		boolean bol2 = Double.isInfinite(f1);
		System.out.println(bol1 + " " + bol2);
		
		double d2 = -1/x;
		float f2 = (float) (-1/x);
		
		System.out.println(d2 + " " + f2);//-Infinity -Infinity
		
		int i5 = (int) (1/d1);
		int i6 = (int) (1/d2);

		System.out.println(i5 + " " + i6);//0 0
		
		double d3 = 1/d1;
		float f3 = (float) (1/d1);
		
		System.out.println(d3 + " " + f3);//0.0 0.0
		
		
		
		double d4 = 1/d2;
		float f4 = (float) (1/d2);
		
		System.out.println(d4 + " " + f4);//-0.0 -0.0
		
				double d5 = d3/d4;
		float f5 = f3/f4;
		
		System.out.println(d5 + " " + f5);//NaN NaN
		
		double d6 = 0/d4;
		float f6 = 0/f4;
		
		System.out.println(d6 + " " + f6);//NaN NaN		
		
		boolean bol3 = Double.isNaN(d6);
		boolean bol4 = Double.isNaN(f6);
		System.out.println(bol3 + " " + bol4);
		
		int i7 = (int) (0/d3);
		int i8 = (int) (0/d3);
		
		System.out.println(i7 + " " + i8);//0 0 
		
		boolean bol5 = Double.isNaN(i7);
		boolean bol6 = Double.isNaN(i8);
		System.out.println(bol5 + " " + bol6);
		
		int i3 = (int) (1000*d3);
		int i4 = (int) (1000*d3);
		
		System.out.println(i3 + " " + i4);//0 0
		
		double d7 = 1000*d3;
		double d8 = 1000*d4;
		
		System.out.println(d7 + " " + d8);//0.0 -0.0		
		
		double d9 = 0/(double)0;
		double d10 = -0.0/(double)0;
		
		System.out.println(d9 + " " + d10);//NaN NaN		
		
		
		
		
	}
	
	

}
