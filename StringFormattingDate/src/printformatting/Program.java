package printformatting;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		FormattingExample fe = new FormattingExample();
		//fe.printIntegerExample();
		fe.printFormatComplexNumbers();
	}
	
	private static void printFormatNumbers(){
		
		byte[] listByte = {1,2,(byte) 600};
		char[] listChar = {1,2,3};
		int[] listInt = {-100,-1000,-50,100,1000,60};
		double[] listDoubles ={1.55,1.66,-11.77,444};
		float[] listFloat = {6.0f,5.33f,8,2.33373333f};
		long[] listLong = {2L,5,7};
		
		
		
		String floatFormat = "%.3f\n";
		printOutFloat(listFloat, floatFormat);
	}
	
	private static void printFormatComplexNumbers(){
		System.out.format("%f, %5.2f \n", Math.PI, Math.PI); 
		System.out.format("%f, %<+020.10f\n", Math.PI); 
	}
	
	static void printFormatTextTable(){
		String[] table1 = {"Help","Frederik","Ha"};
		String[] table2 = {"Hoi","Freddie","Godverdomme"};
		
		int lengthTb1=0;
		for(String s:table1){
			int l = s.length();
			if(l>lengthTb1)
				lengthTb1=l;			
		}
		
		
		int lengthTb2=0;
		for(String s:table2){
			int l = s.length();
			if(l>lengthTb2)
				lengthTb2=l;			
		}
		
		lengthTb2+=5;
		
		String format = "%" + lengthTb1 + "s" + "%" + lengthTb2 + "s%n"; 
		for(int x=0;x<table1.length;x++){
			System.out.format(format,table1[x],table2[x]);
		}
	}
	static void printOutInt(int[] list, String s){
		for(int d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOutDouble(double[] list, String s){
		for(double d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOutFloat(float[] list, String s){
		for(double d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOutFloat(byte[] list, String s){
		for(int d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOutLong(){
		
	}
	
	static void formatterExample(){
		StringBuilder sb = new StringBuilder();
		   // Send all output to the Appendable object sb
		   Formatter formatter = new Formatter(sb, Locale.US);

		   // Explicit argument indices may be used to re-order output.
		   //formatter.format("%4$2s %3$2s %2$2s %1$2s \n", "a", "b", "c", "d");
		   // -> " d  c  b  a"

		   // Optional locale as the first argument can be used to get
		   // locale-specific formatting of numbers.  The precision and width can be
		   // given to round and align the value.
		   formatter.format(Locale.FRANCE, "e = %1$+.4f\n", Math.E);
		   formatter.format("e = %1$+.4f\n", Math.E);
		   // -> "e =    +2,7183"

		   Date d = new Date();
		   Calendar c = Calendar.getInstance();
		   c.setTime(d);
		   //formatter.format("Duke's Birthday: %1$tm %1$te,%1$tY\n", c);
		   //formatter.format("Duke's Birthday: %1$tR", c);
		   
		   System.out.println(sb.toString());
		   System.out.println(formatter.toString());
		   formatter.close();
		   // The '(' numeric flag may be used to format negative numbers with
		   // parentheses rather than a minus sign.  Group separators are
		   // automatically inserted.
		  
	}

	static void returnCharFromInt(int i){
		System.out.printf("%1$5d\t%1$5c\n",i);
	}
	
}
