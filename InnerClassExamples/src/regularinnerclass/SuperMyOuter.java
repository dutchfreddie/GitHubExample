package regularinnerclass;

public class SuperMyOuter {

	protected int x;
	
	SuperMyOuter (int x){
		this.x= x;
	}
	
	SuperMyInner createInnerI(int y){
		SuperMyInner smi = new SuperMyInner(y);
		return smi;
	}	
	
	
	class SuperMyInner{
		private int y;
		
		SuperMyInner(int y){
			this.y =y;
		}
		void returnFromSuperInner(){
			System.out.println("From Inner: Outer x is " + x);
			System.out.println("From Inner: Inner y is " + y);
		}		
	}
	
	public void returnXFromSuperOuter(){
		System.out.println("From Outer: Outer x is " + x);	
	}
}
