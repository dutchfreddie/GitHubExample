package ioexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		IoExamples ioe = new IoExamples();
		String str = ioe.readFileTryResource();
		System.out.println(str);
		str = str.replaceAll("/[\r\t\n]", " ");
		System.out.println(str);
		String[] split = str.split("<%");
		StringBuffer sb = new StringBuffer();
		for(String s:split){
			s = s + "\t";
			sb.append(s);
		}
		str = sb.toString().trim();
		System.out.println(str);
		str = str.replaceAll("/((^|%>)[^\t]*)", "$1\r");
		System.out.println(str);

	}
	
	private static void bufferedWriterExample(String dir, String file){
		String[] stringList = {"line 0","line 1","line 2","line 3","line 8"};
		FileWriter fw;
		BufferedWriter bw;
		File fDir = new File(dir);
		File fFile = new File(fDir,file);
		
		try {
			boolean b = fFile.createNewFile();
			System.out.println(b);
			fw = new FileWriter(fFile);
			bw = new BufferedWriter(fw);
			for(String s:stringList){
				bw.write(s);
				bw.newLine();
				
			}
			bw.close();
			fw.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}	
	}
	
	private static void filesBufferedReaderExample(String dir, String file){
		Path path = Paths.get(dir+file);
		try(BufferedWriter bw = Files.newBufferedWriter(path,StandardCharsets.UTF_16,StandardOpenOption.CREATE)){
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printWriterExample(String dir, String file){
		String[] stringList = {"line 0","line 1","line 2","line 3","line 7"};
		FileWriter fw;
		BufferedWriter bw;
		PrintWriter pw;
		File fDir = new File(dir);
		File fFile = new File(fDir,file);
		
		try {
			fFile.createNewFile();
			//fw = new FileWriter(fFile);
			//bw = new BufferedWriter(fw);
			pw = new PrintWriter(fFile);
			for(String s:stringList){
				pw.println(s);
				//bw.newLine();
				
			}
			pw.close();
			//bw.close();
			//fw.close();
			
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
	}
}
