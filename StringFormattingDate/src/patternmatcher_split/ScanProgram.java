package patternmatcher_split;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScanProgram {

	public static void main(String[] args) {
		
		String s = "Hello World!    3 + 3.0 = 6 ";

		   // create a new scanner with the specified String Object
		   Scanner scanner = new Scanner(s);

		   while (scanner.hasNext()) {
		   // check if the scanner's next token is an int
		   System.out.println("" + scanner.hasNextInt());

		   // print what is scanned
		   System.out.println("" + scanner.next());
		   }

		   // close the scanner
		   scanner.close();
		
		
		

	}
	
	static void stringScanner(){
		String s = "    @System Out Println    ";
		String regexp = "\\s+";
		Scanner scan = new Scanner(s.trim());
		scan.useDelimiter(regexp);
		int x=1;
		while(scan.hasNext()){
			System.out.println(x + ": " + scan.next());
			x++;
		}
		scan.close();
	}
	
	static void scannerFileExample(){
		File file = new File("C:\\WorkspaceFrom\\test.txt");

	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNext()) {
	        	String s = sc.nextLine();
	        		        	
	        	Scanner sc2 = new Scanner(s);
	        	while(sc2.hasNext()){
	        		 int i = sc2.nextInt();
	 	            System.out.print(i + "\t");
	        	}
	        	sc2.close();
	            System.out.println("\n");
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	static void scannerExample(){
		// TODO Auto-generated method stub
				boolean b =true;
				String input = "ss dd     gg  kk";
				String token;
				Scanner s = new Scanner(input);
				//s.useDelimiter("\t");
				while(b=s.hasNext()){
					token = s.next();
					System.out.println(token);
				}
				
				System.out.println("");
				b = true;
				input = "2 2 aa 66";
				s = new Scanner(input);
				//s.useDelimiter("\t");
				while(b=s.hasNext()){
					if(s.hasNextInt())
						System.out.println("integer " + s.next());
					else
						System.out.println("other: " + s.next());
					}
				
				System.out.println("");
				b =true;
				input = "abababababababa";
				s = new Scanner(input);
				s.useDelimiter("aba");
				while(b=s.hasNext()){
					token = s.next();
					System.out.println(token);
				}
				
				System.out.println("");
				b =true;
				input = "22 22 333 42 22";
				s = new Scanner(input);
				while(b=s.hasNext("\\d+")){
					token = s.next();
					System.out.println(token);
				}
	}
	static void regexScannnerExample(){
		String regex = "\\d\\d";
		String input = "005566\npp56cc";
		
		returnFromRegex(regex,input);

		Scanner s = new Scanner(input);
		String token;
		do{
			token=s.findInLine(regex);
			
			System.out.println(token );
			if(!s.hasNext())
				break;
		}
		while(token!=null);
	}
	
	static void returnFromRegex(String regex,String input){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		boolean found = false;
		while (matcher.find()) {
			System.out.println("I found the text " + matcher.group() +
			" starting at " + matcher.start() + " and ending at " + matcher.end());
			found = true;
		}
		if(!found){
			System.out.println("No match found.");
		}
	}
	
	static void examplesCariageNewlineFormfeed(){
		 System.out.println("Lets see: " + '\f'+   
                 "what all that x" + '\r' +  
                 "characters do. z" + '\n' +
                 "Lets see: x" + "\f" +   
                 "what all that x" + "\r" +  
                 "characters do. z" + "\n" ); 
	}
}
