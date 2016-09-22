package wrapperexamples.comparing;

public class Program {
	
	public static void main(String...s){
		
		Short s1 = 10;
		Integer i1 = 10;
		
		//System.out.println(s1==i1);
		System.out.println(s1.equals(i1));
		
		int i2 = s1;
		System.out.println(i1.equals(i2));
		//System.out.println(i2.equals(i1));
		System.out.println(i1==i2);
	}

}
