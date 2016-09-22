package flowcontrol.loopstatement;

public class ForProgram {

	public static void main(String[] args) {
		
		
		
	}
	
	static void example(){
		int x=0;
		for(;;){
			System.out.println(x);
			
			if(x<=10){
				x++;
			}
			if(x>10)
				continue;
			System.out.println("end loop");
		}
	}
	
	static void loopExample(){
		for(int i=0;i<10;i++){
			if(i==4){
				System.out.println("return " + i);
				return;
			}
			if(i==2){
				System.out.println("continue " + i);
				continue;
			}
			System.out.println(i);
		}
		System.out.println("end");
	}
	
	

}
