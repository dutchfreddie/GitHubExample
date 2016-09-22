package literalsexample.primitives;

import java.awt.Dimension;

public class Program {

	Program(int x){
		System.out.println("2");
	}
	
	Program(){
		System.out.println("1");
	}
	
	
	
	static{
		System.out.println("3");
	}
	
	//{System.out.println("4");}
	{System.out.println("5");}
	static{System.out.println("6");}
	
	void returnNext(){
		System.out.println("7");
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		int b =7;
		long l = 800000000000000000L;
	
				
	}
	
	
	
	private static void modifyIntList(int[] list) {
		for(int i = 0;i<list.length;i++){
			list[i] += 1;
		}
		
	}

	
	private static void returnPrimitives2(){
		int x1 = 0x001;
		long l1 = 0x001L;
		long l2 = 0x001l;
		
		System.out.println(x1 + " " + l1 +" " + l2);
		
		char c1 = 0x004E;
		char c2 = 'N';
		char c3 = '\u004E';
		
		System.out.println(c1 + " " + c2 +" " + c3);
		
		int ic1 = c1;
		int ic2 = c2;
		int ic3 = c3;
		
		System.out.println(ic1 + " " + ic2 +" " + ic3);
		
		char cic1 = (char) ic1;
		
		System.out.println(cic1 + " " + ic2 +" " + ic3);
		
		byte b1 = 126;
		byte b2 = 126;
		byte b3 = (byte) (b1+b2);
		int i = b1+b2;
		System.out.println(b3 + " "+i);
	}
	private static void modify(Dimension dim) {
		// TODO Auto-generated method stub
		dim.height = dim.height +50;
		System.out.println("tijdens " + dim.height);
	}

	static void returnPrimitives(){
		int i = 700;
		byte b = (byte) i;
		byte bi = (byte)(i + b);
		byte b2 = (byte) (b + b);
		int ib2 = i+b;
		System.out.println(i + " " + b);
		System.out.println( bi + " " + ib2);
		
		int x = 5;
		int x2 = x;
		System.out.println(x + " " + x2);
		x = x+10;
		System.out.println(x + " " + x2);
	}
	
	static void returnFloatings(){
		float f = (float)2.5;
		float f1 = (float)2.5;
		float f12 = f + f1;
		double d = 2.5;
	}

	static void stringManipulation(){
		String s = "Java";
		String s2 = s;
		System.out.println(s + " " + s2);
		s = s+" Bean";
		System.out.println(s + " " + s2);
	}

	static void referenceVariableModification(){
		Dimension d = new Dimension(5,10);
		Dimension d2 = d;
		System.out.println("before " + d.height);
		modify(d);
		System.out.println("after " + d.height);
		System.out.println("after for d2 " + d2.height);
	}

	static void arrayListExample(){
		int[] list = new int[]{1,2,3};
		for(int i=0;i<list.length;i++){
			System.out.print(list[i] + " ");			
		}
		System.out.println();
		modifyIntList(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i] + " ");			
		}
	}
}
