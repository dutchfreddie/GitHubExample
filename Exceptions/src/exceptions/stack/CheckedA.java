package exceptions.stack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedA {

	public void m1(String path) throws Exception{
		m2(path);
	}
	
	private void m2(String path) throws IOException{
		m3(path);
	}
	
	private void m3(String path) throws IOException{
		
		FileReader fr = new FileReader(path);
	}
}
