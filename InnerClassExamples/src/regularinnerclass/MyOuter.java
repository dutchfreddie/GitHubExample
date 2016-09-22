package regularinnerclass;

class MyOuter {

	static void staticMethod(){
		
	}
	
	private int x;
	
	public MyOuter(int x){
		this.x=x;
	}	
	
	class MyInner {
		
		private int y;
		
		public MyInner(int y){
			this.y=y;
		}
		
		public void returnXFromInner() {
			System.out.println("From Inner: Outer x is " + x);
		}
		
		void returnYFromInner(){
			System.out.println("From inner: Inner y is " + y);			
		}
		
		void changeX(){
			x = x+y;
		}
		
		int getY(){
			return y;
		}
		
		void setY(int y){
			this.y=y;
		}
		
	}
	
	void returnXfromOuter(){
		System.out.println("From Outer: Outer x is " + x);
	}
	
	void returnFromInner(MyInner in) {
		in.returnXFromInner();
		in.returnYFromInner();
	}
	
	MyInner createInner(int y){
		MyInner in = new MyInner(y);
		
		return in;
	}
	
}
