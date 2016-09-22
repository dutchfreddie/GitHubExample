package simpleexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RethrowException {

	public static void main(String args[]) {
		RethrowException rte = new RethrowException();
		try {
			rte.myMethod();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rte.myMethod2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void myMethodUp() throws IOException{
		myMethod();
	}
	
	public void myMethod() throws IOException {
		FileInputStream soccer = new FileInputStream("soccer.txt");
		//soccer.close();
	}
	
	public void myMethod2() throws FileNotFoundException {
		 
		try {
			FileInputStream soccer = new FileInputStream("soccer.txt");
		}
		catch (FileNotFoundException fnfe) {
			throw fnfe;
		}
	}
}
