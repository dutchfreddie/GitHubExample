package initblocks.constructor;

public class SubInit extends SuperInit
{
	static{System.out.println("Sub static instance init 1, round: " + getX());}
	
	SubInit(){
		super();
		System.out.println("Sub empty constructor");
	}
	
	SubInit(int x){
		super(x);
		System.out.println("Sub non empty constructor, round: " + getX());	
	}
	
	{System.out.println("Sub instance init, round: " + getX());}
	
	static {System.out.println("Sub static instance init2, round: " + getX());}

	void returnText(){
		{System.out.println("Sub method, round: " + getX());}
	}
}
