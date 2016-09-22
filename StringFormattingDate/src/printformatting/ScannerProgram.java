package printformatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ScannerProgram {
	public static void main(String[] args) {
		File file = new File("C:\\launchWorldCity32-bits.txt");
		File outputFile = new File("C:\\launchWorldCity32-bits-output.txt");
		Charset encoding = Charset.defaultCharset();
		StringBuffer sb = new StringBuffer();
		try {			
			sb = handleFile(file,encoding);
			
			writeFile(outputFile,sb);
			System.out.println("**************");
			//readFromFile(outputFile);
			//readFromFile(outputFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private static StringBuffer handleFile(File file, Charset encoding)
            throws IOException {
			 StringBuffer sb = new StringBuffer();
             			 
        	 Reader reader2 = new FileReader(file);
             // buffer for efficiency
             Reader buffer = new BufferedReader(reader2); 
             //sb = handleCharacters(buffer);
             sb = handleCharactersScanner(buffer);
             buffer.close();        
        
        return sb;
    }

	private static StringBuffer handleCharactersScanner(Reader reader) throws IOException{
		int r;
        StringBuffer sb = new StringBuffer();
        StringBuffer sbOut = new StringBuffer();
        
        while ((r = reader.read()) != -1) {
            char ch = (char) r;
            if(ch=='\"'){
            	ch=' ';
            	sb.append(ch);
            }
            else
            	sb.append(ch);
                        
        }
        System.out.println(sb.toString());
        
        Scanner scanner = new Scanner(sb.toString());
        scanner.useDelimiter(",");
        boolean b = false;
        int i = 1;
        while(b=scanner.hasNext()){
        	String s = scanner.next();
        	String output = "";
        	String [] list2 = s.split("@");
        	for(String s2:list2){
        		output = output + s2 + "\t";
        	}
        	String sOut = i + ".\t" + output;
        	sbOut.append(sOut + "\n");
        	i++;
        }
        scanner.close();
        
        System.out.println(sbOut.toString());
        
        return sbOut;
	}
	
    private static StringBuffer handleCharacters(Reader reader)
            throws IOException {
        int r;
        StringBuffer sb = new StringBuffer();
        StringBuffer sbOut = new StringBuffer();
        
        while ((r = reader.read()) != -1) {
            char ch = (char) r;
            if(ch=='\"'){
            	ch=' ';
            	sb.append(ch);
            }
            else
            	sb.append(ch);
                        
        }
        System.out.println(sb.toString());
        
        String[] list = sb.toString().split(",");
        int i = 1;
        
        for(String s:list){
        	String output = "";
        	String [] list2 = s.split("@");
        	for(String s2:list2){
        		output = output + s2 + "\t";
        	}
        	String sOut = i + ".\t" + output;
        	sbOut.append(sOut + "\n");
        	i++;
        }
        
        System.out.println(sbOut.toString());
        
        return sbOut;
    }

    private static void writeFile(File file, StringBuffer sb){
    	try {
			Writer writer2 = new FileWriter(file);
			Writer buffer = new BufferedWriter(writer2);
			buffer.write(sb.toString());
			buffer.close();
			
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		
    	}
    }

    private static void readFromFile(File file) throws IOException{
    	Reader read = new FileReader(file);
    	Reader in = new BufferedReader(read);
    	 StringBuffer data = new StringBuffer();  
         int c = 0;  
         while ((c = in.read()) != -1) {  
             data.append((char)c);  
         }  
           
         
         //System.out.println(data.toString());
         BufferedReader in2 = new BufferedReader(read);
         //data = null;
         String line = "";
         while((line = in2.readLine()) !=null){
        	 System.out.println(line);        	 
         }
         in.close();
          in2.close();
    	
    }
}
