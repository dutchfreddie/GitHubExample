package overloadingmethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestStaticShadowing {
	
	public static int X = 10;
	
	public void changeStatic(){
		X = X+10;
		int X=20;  
		if(X>10){
			int y = 10;
		}
	}
	
	public void m() throws FileNotFoundException{
		File f = new File("");
		FileReader fr = new FileReader(f);
		
	}
	
	public void m(int x){
		
		
	}
	
	
	
	

}
