package regularinnerclass;

public class MyOuter2 {

	public void makeInner() {
		MyInner2 in = new MyInner2();
		in.seeOuter();
	}
	class MyInner2 {
		public void seeOuter() {
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + MyOuter2.this);
		}
	}
	
	void returnThis(){
		System.out.println("The Outer class ref is " + this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyOuter2 mo = new MyOuter2();
		mo.returnThis();
		MyInner2 mi = mo.new MyInner2();
		mi.seeOuter();
		
		
	}

}
