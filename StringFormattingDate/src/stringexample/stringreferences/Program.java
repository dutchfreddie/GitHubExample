package stringexample.stringreferences;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		simpleManipulations();
		
		
		
		
	}
	
	static void simpleManipulations(){
		String s1 = "abc";
		String s2 = s1.toUpperCase();
		System.out.println(s1+s2);
	}
	
	static void StringEqualExample(){
		String s1 = new String();
		s1 = "abc";
		String s2 = new String("abc");
		System.out.println("==: " + (s1==s2) + "\t" +s1.equals(s2));
		s2=s1;
		System.out.println("==: " + (s1==s2) + "\t" +s1.equals(s2));
		s1 = s1.concat("def");
		System.out.println("==: " + (s1==s2) + "\t" +s1.equals(s2));
		s2 =s1;
		System.out.println("==: " + (s1==s2) + "\t" +s1.equals(s2));
	}
	
	static void StringExamples(){
		String s1 = new String();
		s1 = "abc";
		String s2 =s1;
		System.out.println(s1 + " " + s2);
		s1 = s1.concat("def");
		System.out.println(s1 + " " + s2);
		s2 =s1;
		System.out.println(s1 + " " + s2);
		s2.concat("ghi");
		System.out.println(s1 + " " + s2);
		s2 = "abc";
		String s3 = "ggg";
		String s4 = "ggg";
		String s5 = new String("ggg");
		String s6 ="abcdef";
		String s7=s6.substring(2,4);
		
	
	}

	static void StringExample2(){
		String s1 = "abc";
		System.out.println(s1);
		s1.concat("cde");
		System.out.println(s1);
		String s2 = s1;
		s1 = s1.concat("cde");
		System.out.println(s1);
		System.out.println("");
		s1 = s1.concat("efg").toUpperCase().substring(4, 7);
		System.out.println(s1);

	}
	
	static void StringExample3(){
		String s1 = "abc";
		String s2 = s1;
		String s3 = new String("abc");
		System.out.println(s1 + " " + s2);
		boolean b1 = (s1==s3);
		boolean b2 = (s1.equals(s3));
		System.out.println(b1 + " " + b2 );
		s1 = s1.concat("def");
		System.out.println(s1 + " " + s2);
		String s5 = null;
		System.out.println(s5==null);// + " " + s5.equals(null));
		System.out.println(s5!=null);
	}
	
	static void StringBuilderExample(){
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		sb.append("ghi");
		StringBuilder sb2 = new StringBuilder();
		sb2 =sb;
		sb2.append("jkl");
		System.out.println(sb.toString() + " " + sb2.toString());
		StringBuilder sb3 = new StringBuilder(sb);
		sb2.append("mmm");
		System.out.println(sb.toString() + " " + sb2.toString() + " " + sb3.toString());
		sb.append(sb2);
		String s = sb.append(sb2).toString();
		sb.insert(3, 200.55);
	}
}
