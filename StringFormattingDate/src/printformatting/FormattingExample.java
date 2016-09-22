package printformatting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;

public class FormattingExample {
	
	private static String dir = "G://SunCertif_WorkSpace//Chapter6//files//";
	private static String formatIntFile = "printformatInt.txt";
	private static String formatDoubleFile = "printformatDouble.txt";
	
	public void printIntegerExample(){
		
		int[] listInt = {-100,-1000,-50,100,1000,60};		
		double[] listDoubles ={1.55,1.66,-11.77,444};
		
		File fInt = new File(dir + formatIntFile);
		if(!fInt.exists()){
			try {
				fInt.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int maxChar = 0;
		for(int x=0;x<listInt.length;x++){
			int i = listInt[x];
			String s = Integer.toString(i);
			int nrCharInt = s.length();
			System.out.println(s + ": "+ nrCharInt);
			if(nrCharInt>maxChar)
				maxChar=nrCharInt;
		}
		
		System.out.println("**********************");
		
		String formatString ="%" + maxChar + "d\n";
		for(int x=0;x<listInt.length;x++){
			System.out.printf(formatString, listInt[x]);
		}
		
		System.out.println("**********************");
		
		for(int x=0;x<listInt.length;x++){
			System.out.format(formatString, listInt[x]);
		}	
	}
	
	public void printFormatComplexNumbers(){
		
		
		
		
		System.out.format("%1$f,%2$5.2f \n", Math.PI,5.60023); 
		//System.out.format("%f, %<+020.10f\n", Math.PI); 		
		System.out.format("%f,\n", Math.PI); 
		
		
		
		
		
	}
	
	

}
