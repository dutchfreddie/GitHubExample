package ioexample;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Console c = System.console();
		if (c == null) {
            //System.err.println("No console.");
            ///System.exit(1);
        }
		else{
			System.out.println("there is a Console");
			String login = c.readLine("Enter your login: ");
			System.out.println(login);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        try {
			String s = br.readLine();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.print("Enter Integer: ");
        try{
        	String s = br.readLine();
        	System.out.println(s);
        }
        catch(IOException e){
        	
        }
        
		
		
		
		
		
	}
}

class MyUtility { // #5: class to test
String doStuff(String arg1) {
// stub code
return "result is " + arg1;
}
}
