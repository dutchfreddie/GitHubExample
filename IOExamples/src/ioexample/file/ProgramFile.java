package ioexample.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ProgramFile {

	public static void main(String[] args) {
		
		String fileName = "G://Test//Dir1//jpg//index.jpg";
		infoFile(fileName);
		
	}
	
	static void infoFile(String fileName){
		File file = new File(fileName);
		if(file.exists()){
			printOut("name\t" + file.getName());
			printOut("path\t" + file.getPath());
			printOut("absolute path\t" + file.getAbsolutePath());		
			try {
				printOut("canonical path\t" + file.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printOut("parent\t" + file.getParent());
			printOut("toString" + file.toString());
			System.out.println();
			printOut("exists\t" + file.exists());
			printOut("isFile" + file.isFile());
			printOut("isDirectory\t" + file.isDirectory());
			printOut("isAbsolute" + file.isAbsolute());
			printOut("isHidden\t" + file.isHidden());		
			System.out.println();
			printOut("free space\t" + file.getFreeSpace()/1000000000 + " Gb");
			printOut("total space\t" + file.getTotalSpace()/1000000000 + " Gb");
			printOut("usable space\t" + file.getUsableSpace()/1000000000 + " Gb");		
			printOut("length\t" + file.length()/1000 + " kb");
		}		
	}
	
	static void printOut(String s){
		System.out.println(s);
	}
	
	static void copyFile(){
		String from = "H://fileFrom.txt";
		String to = "H://fileTo.txt";
		File fileFrom = new File(from);
		File fileTo = new File(to);
		try {
			boolean exist =fileTo.createNewFile();
			System.out.println(exist);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream read=null;
		OutputStream write=null;
		try {
			read = new FileInputStream(fileFrom);
			write = new FileOutputStream(fileTo);
			byte[] buffer = new byte[1024];
			int readingByte=0;
			while((readingByte=read.read(buffer))>0){
				write.write(buffer,0,readingByte);
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		finally{			
			try {
				read.close();
				write.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
	static void renameMoveFile(){
		String from = "H://test2.txt";
		String to = "H://moveFile//test2.txt";
		File fileFrom = new File(from);
		File fileTo = new File(to);
		boolean rename = fileFrom.renameTo(fileTo);
		System.out.println(rename);
	}
	
	static void createFile(){
		
		String path = "H://test7.txt";
		
		File file = new File(path);
		try {
			boolean exist = file.createNewFile();
			System.out.println(exist);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void deleteFile(){
		String path = "H://deleteFolder";
		
		File file = new File(path);
		boolean delete = file.delete();
		System.out.println(delete);
	}

}
