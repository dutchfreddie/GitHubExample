package literalsexample.overload;

public class Program2 {

	Program2 p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 p2 = new Program2();
		p2.p=p2;
		try {
			p2.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte b = (byte)5.2;
		Byte b3 = b;
		output(b3);
		output(155);
	}
	
	static void output(Object o){
		if(o instanceof Byte){
			System.out.println("byte");
			Byte b = (Byte)o;
			byte b2 = b;
			System.out.println(b2);
			System.out.println(o);
			
		}
		else if(o instanceof Integer){
			System.out.println("integer");
			int x = (Integer)o;
			int x2= (int)o;
			Integer i = (int)o;
			
		}
		
	}
	
	static void outputByte (Long l){
		
	}

}
