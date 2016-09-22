package flowcontrol.ifelsestatement;

public class Program {

	public static void main(String[] args) {
		
		simpleHigherLower(250);
	}
	
	static void firstExample(){
		
		boolean b2 = false;
		if(b2=true){
			System.out.println("made it" + b2);			
		}
		else
			System.out.println("nothing" + b2);
		int score = 350;
		if (score > 200)
		if (score < 400)
		if (score > 300)
		System.out.println(1);
		else
		System.out.println(2);
		else
			System.out.println();
		else
			System.out.println();
	}
	
	static void simpleHigherLower(int x){
		if(x>200){
			if(x<400){
				if(x>300){
					System.out.println("X between 300 and 400");	
					return;
				}
				else{
					System.out.println("X between 200 and 300");
				}
			}
			else{
				System.out.println("X larger than 400");
			}
		}
		System.out.println("end");
	}
	
	
	

}
