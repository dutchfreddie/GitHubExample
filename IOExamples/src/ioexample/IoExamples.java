package ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

public class IoExamples {
	
	private static String dir = "G://SunCertif_WorkSpace//Chapter6//files//";
	private static String existingFile = "javascript.txt";
	private static String newFile = "newfile.txt";
	
	public void createExistingFile(){
		
		String path = dir+existingFile;
		System.out.println(path);
		File file = new File(path);
		try {
			boolean b = file.createNewFile();
			System.out.println("Existing file? " + b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		File dirMain = new File(dir);
		String[] listPaths = dirMain.list();
		File[] listFiles= dirMain.listFiles();
		System.out.println ( listPaths.length + " " + listFiles.length);
	}
	
	public void readExistingFile(){
		System.out.println("");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		FileReader fileReader=null;
		try {
			fileReader = new FileReader(dir+existingFile);
			int c=0;
			while((c = fileReader.read())!=-1){
				sb.append(c);
				sb1.append((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Reader reader = new BufferedReader(fileReader);
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fileReader!=null){
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(sb.toString());
		//System.out.println(sb1.toString());		
	}
	
	public void readExistingFileWithBuffer(){
		FileReader fileReader = null;
		BufferedReader br = null;
		StringBuffer sb = new StringBuffer();
		try {
			fileReader = new FileReader(dir+existingFile);
			br = new BufferedReader(fileReader);
			String s = "";
			while((s=br.readLine())!=null){
				System.out.println(s);
				sb.append(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO");
			e.printStackTrace();
		}
		finally{
			try {
				if(fileReader!=null)
					fileReader.close();
				if(br!=null)
					br.close();
			} catch (IOException e) {
				System.out.println("Finally");
				e.printStackTrace();
			}
		}
		System.out.println("**************");
		System.out.println(sb.toString());
		System.out.println("**************");		
	}
	
	public void writeToFileWithFileWriter(){
		File file = new File(dir+newFile);
		FileWriter fw = null;
		/*
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		try {
			fw = new FileWriter(file);
			fw.write("test2\n");
			fw.write("test2\n");			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
	
	public void writeToFileBufferedWriter(){
		
		File file = new File(dir+newFile);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("File exists");
		}
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			//bw.append(dir);
			bw.write("testbw");
			bw.newLine();
			bw.write("testbw");
						
		} catch (IOException e) {			
			e.printStackTrace();
		}
		finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fw!=null){				
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}		
	}
	
	public void writeToFilePrintWriter(){
		
		PrintWriter pw =null;
		try {
			pw = new PrintWriter(dir+existingFile);
			pw.print("pwTest2");pw.print("pwTest");pw.print("pwTest\n");
			pw.println("pwTestLine");pw.println("pwTestLine");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pw.close();
		}
	}
	
	public String readFileTryResource(){
		StringBuffer sb = new StringBuffer();
		try(BufferedReader br = new BufferedReader(new FileReader(dir+existingFile))){
			String s=null;
			
			while((s=br.readLine())!=null){
				//System.out.println(s);
				sb.append(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public void writeFileTryResource(boolean append){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(dir+existingFile,append))){
			bw.write("Resource");bw.write("Resource2");bw.newLine();
			bw.write("Resoure");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
