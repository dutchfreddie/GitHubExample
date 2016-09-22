package ioexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileExamples {
	
	private static String oldDir = "G://SunCertif_WorkSpace//Chapter6//files//oldDir//";
	private static String newDir = "G://SunCertif_WorkSpace//Chapter6//files//newDir//";
	private static String existingFile = "oldFile.txt";
	private static String renameFile = "renameFile.txt";
	private static String moveFile = "moveFile.txt";
	private static String copyFile = "copyFile.txt";
	
	public void createMoveCopyFile(){
		
		File oldDirFile = new File(oldDir);
		if(!oldDirFile.exists()){
			boolean b = oldDirFile.mkdir();
			System.out.println(b);			
		}	
		File file = new File(oldDir+existingFile);
		if(!file.exists()){
			try {
				boolean b = file.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File newFile = new File(oldDir+renameFile);
		if(newFile.exists()){
			newFile.delete();
		}
		file.renameTo(newFile);
		
		File newDirFile = new File(newDir);
		if(!newDirFile.exists()){
			boolean b = newDirFile.mkdir();
			System.out.println(b);			
		}	
		
		file = new File(oldDir+existingFile);
		if(!file.exists()){
			try {
				boolean b = file.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		File copyFileFile = new File(newDir + moveFile);
		file.renameTo(copyFileFile);
		
	}
	
	public void moveFile(){
		
	}
	
	public void copyFile(){
		
		File oldDirFile = new File(oldDir);
		if(!oldDirFile.exists()){
			boolean b = oldDirFile.mkdir();
			System.out.println(b);			
		}	
		File file = new File(oldDir+existingFile);
		if(!file.exists()){
			try {
				boolean b = file.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("Test"); bw.newLine();bw.write("Test2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File fileCopied = new File(oldDir+copyFile);
		if(!fileCopied.exists()){
			try {
				boolean b = fileCopied.createNewFile();
				System.out.println(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(file);
			out = new FileOutputStream(fileCopied);
			byte[] buff = new byte[1024];
			int read = 0;
			while((read = in.read(buff))>0){
				out.write(buff,0,read);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
