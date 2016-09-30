package methods.returnkeyword;



public class A{

	public void methodWithReturnSimple(int i){
		
		System.out.println("Start method: " + i);
		if(i<5)
			return;
		else
			i+=20;
		System.out.println("End method: " + i);
	}
	
	public void staticMethodWithReturn(int i){
		System.out.println("Start method" + i);
		if(i<5)
			return;
		else
			i+=20;
		System.out.println("End method: " + i);
	}
	
	public void methodWithReturn(int i){
		System.out.println("Start method: " + i);
		for(int n=1;n<5;n++){
			if(i>20){
				System.out.println("return: " + n);
				return;
			}
				
			else{
				i+=10;
				System.out.println("Middle method: " +i);
			}				
		}
		System.out.println("End method: " + i);
	}
	
	public void methodWithBreak(int i){
		System.out.println("Start method: " + i);
		for(int n=1;n<5;n++){
			if(i>20){
				System.out.println("break: " + n);
				break;
			}
				
			else{
				i+=10;
				System.out.println("Middle method: " +i);
			}				
		}
		System.out.println("End method: " + i);
	}
	
	public void methodWithContinue(int i){
		System.out.println("Start method: " + i);
		for(int n=1;n<5;n++){
			if(i>20){
				System.out.println("continue: " + n);
				continue;
			}
				
			else{
				i+=10;
				System.out.println("Middle int method: " +i);
			}				
		}
		System.out.println("End method: " + i);
	}

}
