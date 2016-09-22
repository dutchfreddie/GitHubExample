package ioexample.reader;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Program {

	public static void main(String... args){
		
		String path = "H://fileFrom.txt";
		File file = new File(path);
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){			
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			
			int ch=0;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	static void bufferedReaderExample(){
		String path = "H://fileFrom.txt";
		File file = new File(path);
		BufferedReader br =null;
		try {
			br = new BufferedReader(new FileReader(file));
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			
			int ch=0;			
			while((ch=br.read())>0){
				System.out.print((char)ch);
			}
			
			char[] bytes = new char[1024];
			int readingB=0;
			while((readingB=br.read(bytes))>0){
				System.out.print((char)readingB);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
		}
	}
	
	static void fileReaderExample(){
		String path = "H://fileFrom.txt";
		File file = new File(path);
		FileReader fr=null;
		try {
			 fr = new FileReader(file);
			int ch = 0;
			while((ch=fr.read())>0){
				System.out.print((char)ch);
			}
			System.out.println();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
		}
	}
	
	static void defaultCharset(){
		String defaultCharacterEncoding = System.getProperty("file.encoding");
        System.out.println("defaultCharacterEncoding by property: " + defaultCharacterEncoding);
        System.out.println("defaultCharacterEncoding by code: " + getDefaultCharEncoding());
        System.out.println("defaultCharacterEncoding by charSet: " + Charset.defaultCharset());

	}
	
	public static String getDefaultCharEncoding(){
        byte [] bArray = {'w'};
        InputStream is = new ByteArrayInputStream(bArray);
        InputStreamReader reader = new InputStreamReader(is);
        String defaultCharacterEncoding = reader.getEncoding();
        return defaultCharacterEncoding;
    }


}
