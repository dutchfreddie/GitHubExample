package inheritanceexample.staticexample;

import java.util.Random;

public class Animal {

	static final int NUMBERFOOTS= 4;
	
	static int returnNumberFoots(){
		Random rd = new Random();
		int x = rd.nextInt(5);
				
		return x;
	}
}
