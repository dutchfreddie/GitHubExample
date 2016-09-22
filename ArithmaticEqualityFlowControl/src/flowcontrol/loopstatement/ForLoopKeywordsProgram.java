package flowcontrol.loopstatement;

public class ForLoopKeywordsProgram {

	public static void main(String[] args) {
		
		loopExample(2,40,60);
		System.out.println("After loopExample");

	}
	
	static void loopExample(int conti, int breakL, int end){
		for(int i=0;i<10;i++){
			if(i==conti){
				System.out.println("continue " + i);
				continue;
			}
			if(i==breakL){
				System.out.println("break " + i);
				break;
			}
			if(i==end){
				System.out.println("return " + i);
				return;
			}
			System.out.println(i);
		}
		System.out.println("end");
	}

}
