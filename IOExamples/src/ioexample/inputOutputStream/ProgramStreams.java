package ioexample.inputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ProgramStreams {

	public static void main(String[] args) {
		
		InputStream inStream = null;
	    BufferedInputStream bis = null;

	      try{
	         // open input stream test.txt for reading purpose.
	         inStream = new FileInputStream("H://Demo1.jpg");
	         
	         // input stream is converted to buffered input stream
	         bis = new BufferedInputStream(inStream);
	         
	         // read number of bytes available
	         int numByte = bis.available();
	         System.out.println(numByte);
	         // byte array declared
	         byte[] buf = new byte[1024];
	         
	         // read byte into buf , starts at offset 2, 3 bytes to read
	         bis.read(buf);
	         
	         // for each byte in buf
	         for (byte b : buf) {
	            System.out.println((char)b+": " + b);
	         }
	         }catch(Exception e){
	            e.printStackTrace();
	         }finally{
	            // releases any system resources associated with the stream
	            if(inStream!=null)
					try {
						inStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            if(bis!=null)
					try {
						bis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	      }	
		
		
	}
	
	static void fileInputOutputStream(){
		String pathFrom = "H://Demo1.jpg";
		String pathTo = "H://Demo1To.jpg";		
		try {
			File fileTo = new File(pathTo);
			if(!fileTo.exists()){
				boolean exists=fileTo.createNewFile();
				System.out.println(exists);
			}
				
			
			FileInputStream fis = new FileInputStream(pathFrom);
			FileOutputStream fos = new FileOutputStream(fileTo,false);				
			int    bytesRead = fis.read();

			while(bytesRead != -1) {
			  bytesRead = fis.read();
			  System.out.print(bytesRead+"*");
			  if(bytesRead>-1)
				  fos.write(bytesRead);
			}			
			
			fis.close();fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void readWriteByteForByte(){
		String pathFrom = "H://Demo1.jpg";
		String pathTo = "H://DemoTo3.jpg";
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			File fileTo = new File(pathTo);
			if(!fileTo.exists()){
				boolean exists=fileTo.createNewFile();
				System.out.println(exists);
			}
				
			
			FileInputStream fis = new FileInputStream(pathFrom);
			FileOutputStream fos = new FileOutputStream(fileTo,false);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int by = bis.read();
			int tot = 1;
			while(by != -1) {			  
			  by = bis.read();
			  System.out.print(by + "*");
			  bos.write(by);
			  tot++;
			}
			System.out.println();
			System.out.println(tot);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				bis.close();bos.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	static void readWriteBufferedByteArrays(){
		String pathFrom = "H://fileTo.txt";
		String pathTo = "H://fileTo.txt";
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			File fileTo = new File(pathTo);
			if(!fileTo.exists()){
				boolean exists=fileTo.createNewFile();
				System.out.println(exists);
			}
				
			
			FileInputStream fis = new FileInputStream(pathFrom);
			FileOutputStream fos = new FileOutputStream(fileTo,false);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			byte[] data      = new byte[1];
			int    bytesRead = bis.read(data);

			while(bytesRead != -1) {
			  bytesRead = bis.read(data);
			  System.out.print(bytesRead+"*");
			  bos.write(bytesRead);
			}	
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				bis.close();bos.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	


}
