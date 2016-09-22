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
