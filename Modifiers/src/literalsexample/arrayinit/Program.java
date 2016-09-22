package literalsexample.arrayinit;

public class Program {

	public static void main(String[] args) {
		int i1 = 2;
		int i2 = 3;
		byte b1=2;
		byte b2 = 3;
		int[] listInt = new int[]{i1,i2,b1,b2};
		byte[] arrayByte = new byte[]{(byte)i1,(byte)i2,b1,b2};
		
		String s = "Ëen";
		String s2 = s;
		s = s + "Twee";
		
		System.out.println(s + " " + s2);
	}

}
