package wrapperexamples.construction;

public class Program {

	public static void main(String[] args) {

		Integer i = 100000;
		Boolean b = false;
		
		byte byt = i.byteValue();
		long l = i.longValue();
		System.out.println(i + " " + byt + " " + l);
		
		
		Float f = 1.555f;
		
		float f3 = Float.parseFloat("1.555f");
		System.out.println(f + " " + f3);
		int b4 = Integer.parseInt("1");
		System.out.println("" + b4);
		
		String s =Float.toString(1.555f);
		
		String s2 = Short.toString((short) 55);

		Long.toString(10000000000000000l);
		
		String s3 = Long.toString(100000000, 16);
		System.out.println();
		System.out.println(s3);
		
		Integer iS = Integer.getInteger("l",85);
		System.out.println(iS);
		
		
	}

}
