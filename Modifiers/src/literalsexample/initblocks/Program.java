package literalsexample.initblocks;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void initExample(){
		SubInit subI = new SubInit(1);
		subI.returnText();
		SubInit subI2 = new SubInit(2);
		subI2.returnText();
		float f = 2.5f;
		double d = 2.5;
		String fs = "2.5f";
		String ds = "2.5";
		Float ff = new Float(f);
		Float fd = new Float(d);
		Float fdfs = new Float(fs);
		Double dd = new Double(f);
	}

}
