package exceptionwithreturnvalue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProgramPropegate {

	public static void main(String[] args) throws Exception{
		method1();
	}
	
	private static void method1() throws Exception{
		try{
		method2();
		}
		catch(IOException fne){
			throw fne;
		}
	}
	
	private static void method2() throws IOException{
		File f = new File("");
		FileInputStream fis =new FileInputStream(f);
	}
}
