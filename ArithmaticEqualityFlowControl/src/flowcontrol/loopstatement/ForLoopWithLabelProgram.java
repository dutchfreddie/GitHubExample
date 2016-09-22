package flowcontrol.loopstatement;

public class ForLoopWithLabelProgram {

	public static void main(String...strings){
		loopLabeledExample();
	}
	
	static void loopLabeledExample(){
		outerLabeled:
		for(int i=0;i<10;i++){
			if(i==2){
				System.out.println("return first loop labeled " + i);
				//break outerLabeled;
			}			
			else if(i==4){
				for(int j=0;j<10;j++){
					if(j<=4){
						System.out.println("return second loop " + i + " " + j);
					}
					else{
						System.out.println("return second loop break innerLabeled " + i + " " + j);
						continue outerLabeled;
					}
				}
			}			
			
			System.out.println("Get to the end at i = " + i);
		}
		System.out.println("end");
	}

}
