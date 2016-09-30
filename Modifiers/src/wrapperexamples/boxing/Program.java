package wrapperexamples.boxing;

public class Program {

	public static void main(String... s){
		
		Integer i = 800;
		i++;
		Integer i2 = i;
		Integer i4 = 800;
		System.out.println(i==i2);
		System.out.println(i==i4);
		
		Boolean b = new Boolean(false);
		Boolean b2 = new Boolean(false);
		System.out.println(b==b2);
		
		Long l1 = new Long(10);
		Long l2 = new Long(10);
		System.out.println(l1==l2);
		
		Short s1 = new Short((short) 10);
		Short s2 = new Short((short) 10);
		System.out.println(s1==s2);
		
		Short s3 = 10;
		Short s4 = 10;
		System.out.println(s3==s4);
		
		Integer i1 = new Integer(10);
		Integer i3 = new Integer(10);
		System.out.println(i1==i3);
	}
}
