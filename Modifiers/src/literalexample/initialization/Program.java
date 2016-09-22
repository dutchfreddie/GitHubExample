package literalexample.initialization;

public class Program {

	public static void main(String[] args) {
		
		PassingVariables pv1 = new PassingVariables(10,10);
		System.out.println(pv1.getX() + " " + pv1.getY());
		PassingVariables pv2 = pv1;
		System.out.println(pv2.getX() + " " + pv2.getY());
		modify(pv1);
		System.out.println(pv1.getX() + " " + pv1.getY());
		System.out.println(pv2.getX() + " " + pv2.getY());
		System.out.println();
		int x = 10;
		System.out.println(x);
		modifyInt(x);
		System.out.println(x);

	}

	private int year;
	private String name;
	
	public void showYear() {
		System.out.println("The year is " + year);
	}
	
	public void showName() {
		System.out.println("The year is " + name);
	}
	
	public static void modify(PassingVariables pv){
		pv.setX(pv.getX()+10);
	}
	
	public static void modifyInt(int x){
		x=x+10;
		System.out.println(x);
	}
	
	
}
