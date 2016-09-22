package ioexample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExamples {

	private static String oldDir = "G://SunCertif_WorkSpace//Chapter6//files//oldDir//";
	private static String newDir = "G://SunCertif_WorkSpace//Chapter6//files//newDir//";
	private static String existingFile = "observer.gif";
	private static String newFile = "observer2.gif";
	private static String moveFile = "moveFile.txt";
	private static String copyFile = "copyFile.txt";
	
	 public void readByteFile(){
		 
		 BufferedInputStream bis =null;
		 BufferedOutputStream bos =null;
		 try {
			 File fNew = new File(newDir+newFile);
			 if(!fNew.exists()){
				 fNew.createNewFile();
			 }
			FileInputStream fis = new FileInputStream(new File(newDir + existingFile));
			bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(fNew);
			bos = new  BufferedOutputStream(fos);
			
			int i = 0;
			while((i=bis.read())>0){
				 bos.write(i);
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
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	
}
