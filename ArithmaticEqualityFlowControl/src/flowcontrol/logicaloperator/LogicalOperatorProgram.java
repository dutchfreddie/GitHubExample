package flowcontrol.logicaloperator;

public class LogicalOperatorProgram {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		int z = 10;
		boolean b1a =y>10 | z>8;
		boolean b1 = (x<4 && y>10 || z>5 && x>0);
			System.out.println(b1);
			
		boolean b2a = true && false;	
		boolean b2 =  (b2a || true);
			System.out.println(b2a + " " + b2);

	}

}
