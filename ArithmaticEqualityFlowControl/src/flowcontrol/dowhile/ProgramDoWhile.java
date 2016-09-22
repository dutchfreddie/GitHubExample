package flowcontrol.dowhile;

public class ProgramDoWhile {

	public static void main(String[] args) {
		
		labelWhileLoop();

		
	}
	
	static void simpleWhileLoop(){

		int num=0;		
		
		while (++num < 10) {
			System.out.println(num);
			
		}
		System.out.println(num);
	}
	
	static void labelWhileLoop(){
		int age = 10;
		
		outer:
		while(age<=21){
			age++;				
			System.out.println("Your age is: " + age);
			if(age == 16){
				System.out.println("get you driving licence");
				continue outer;
			}
			
			System.out.println();
		};
		
		
	}
	
}
		
		
		
		


