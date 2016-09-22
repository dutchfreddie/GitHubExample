package exceptions.stack;

public class Program {

	public static void main(String[] args) {
		int start = 0;
		A a = new A();
		//a.m1(start);
		
		CheckedA ca = new CheckedA();
		try {
			ca.m1("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
