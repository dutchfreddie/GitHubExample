package methods.shadowing;

public class Program {

	public static void main(String[] args) {
		
		PassingVariables pv1 = new PassingVariables(10,10);
		//10 10
		System.out.println(pv1.getX() + " " + pv1.getY());
		pv1.increaseX(); pv1.increaseY();
		System.out.println(pv1.getX() + " " + pv1.getY());
		//20 20
		PassingVariables pv2 = new PassingVariables(50,50);
		System.out.println(pv2.getX() + " " + pv2.getY());
		//50 50
		pv2 = pv1;
		System.out.println(pv2.getX() + " " + pv2.getY());
		//20 20
		int y=30;
		System.out.println("y before: " +  y + ";y withi method: " + pv1.shadowIncrease(y) + ";y after method: " + y);
		//y before: 30;y withi method: 40;y after method: 30
		System.out.println(pv1.getX() + " " + pv1.getY());
		System.out.println(pv2.getX() + " " + pv2.getY());
		//20 40
		//20 40
		
		
		

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
