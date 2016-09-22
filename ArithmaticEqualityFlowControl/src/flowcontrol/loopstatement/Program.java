package flowcontrol.loopstatement;

public class Program {

	public static void main(String[] args) {
		
		//labelWhileLoop();
		//continueExample();
		//forLoop();
		//labelForLoop();
		for(int x=0;x<3;System.out.println(x),x++,System.out.println(x)){
			System.out.println("D"+x);
		}
		
	}
	
	static int forLoop(){
		int b =4;
		for(int a =1;a<5;a++,System.out.println("something from " + a),System.out.println("Something more from " + a)){
			//b=b-a;
			System.out.println("Something else from iteration: " + a);
		}	
		
		return b;
	}
	
	static void continueExample(){
		int[] list ={1,2,3,4,5,6};
		for(int i:list){
			System.out.println("start printing");
			if(i==3){
				System.out.println("at " + i);
				//continue;
				//break;
				return;
			}
			System.out.println("we are now at: " + i + "\n");			
		}
		
		System.out.println("the end");
	}
	
	
	

}
