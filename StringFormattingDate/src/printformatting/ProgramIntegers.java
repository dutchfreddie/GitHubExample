package printformatting;

public class ProgramIntegers {

	public static void main(String[] args) {
		byte[] listBytes = new byte[350];
		short[] listShorts = new short[350];
		char[] listChars = new char[350];
		for(int i = 0;i<350;i++){
			listBytes[i] = (byte)(i);
			listShorts[i] = (short) i;
			listChars[i] = (char) i;
		}
		String s = "%1$d\t%1$c\n";
		//printOut(listBytes, s);
		//printOut(listShorts,s);
		printOut(listChars,s);
		
		int x = 500;
		byte y = (byte)x;
		short s2 = (byte)x;
		long l = 500;
		fromInt(x); fromInt(y);fromInt(s2);fromInt((int) l);
	}
	
	static void fromInt(int x){
		System.out.println("fromInt: " + x);
	}
	
	static void fromInt(byte x){
		System.out.println("fromInt_byte: " + x);
	}

	static void printOut(byte[] list, String s){
		for(int d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOut(short[] list, String s){
		for(int d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
	
	static void printOut(char[] list, String s){
		for(int d:list){
			try{
				System.out.printf(s,d);		
			}
			catch(Exception e){
				System.out.println("no printout with: " + d);
			}	
		}
	}
}
