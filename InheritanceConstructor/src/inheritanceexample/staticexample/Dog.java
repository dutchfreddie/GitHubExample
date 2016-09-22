package inheritanceexample.staticexample;

import java.util.Random;

public class Dog extends Animal{

	static int returnNumberFoots(){
		
		Random rd = new Random();
		int x = rd.nextInt(5);
				
		return x;
	}
}
