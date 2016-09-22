package literalsexample.initblocks;

public class SuperInit {

	private static int x;
	
	static {System.out.println("Super static instance init 1, round: " + getX());}
	
	SuperInit(){
		System.out.println("Super empty constructor, round: " + getX());
	}
	
	SuperInit(int x){
		this.x = x;
		System.out.println("Super non-empty constructor, round: " + getX());
		
	}
	
	public static int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	{System.out.println("Super instance init 1, round: " + getX());}
	
	{System.out.println("Super instance init 2, round: " + getX());}
}
