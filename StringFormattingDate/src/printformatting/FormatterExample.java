package printformatting;

import java.util.Formatter;

public class FormatterExample {

	
	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("abs");
		Formatter formatter = new Formatter(sb);
		formatter.format("%1$4c* %2$5.2f*", 'd', -100.555555555);
		System.out.println(formatter.toString());
		System.out.println(sb.toString());
		System.out.println("*****0");
		formatter.close();
		
		String s = String.format("%d %f %s         %d", 1, 4.0, "test",1);
		System.out.println(s);
		
		char euro = '\u20ac';
		System.out.println(euro);
		char x = 'a';
		String s2 = "fraddia";
		System.out.println("" + s2.indexOf(x));
		for(int i=0;i<s2.length();i++){
			System.out.print(s2.charAt(i) + " " + (int)s2.charAt(i) + " - ");
		}

		
	}
	
	private static void formatWithStrings(){
		StringBuffer sb = new StringBuffer("abs");
		Formatter formatter = new Formatter(sb);
		formatter.format(" There does not have to be %1$4c* %1$2s%3$2s %4$+(20f*",'c', "c", "d", 1.555555555555);
		System.out.println(formatter.toString());
		System.out.println(sb.toString());
		System.out.println("*****0");
		formatter.close();
	}
	
	static void formatWithInt(){
		StringBuffer sb = new StringBuffer("abs");
		Formatter formatter = new Formatter(sb);
		formatter.format("%1$4c* %2$(5d*", 'd', -100);
		System.out.println(formatter.toString());
		System.out.println(sb.toString());
		System.out.println("*****0");
		formatter.close();
	}
}
