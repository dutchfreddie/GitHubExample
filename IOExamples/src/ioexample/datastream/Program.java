package ioexample.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		createEmptyDataFile();
		File fileData = new File("G://data//test.data");
		if(fileData.exists()){
			try (DataOutputStream dos =	new DataOutputStream(new FileOutputStream(fileData))) {
				 //dos.writeInt(123);
			     //dos.writeFloat(123.45F);
			     //dos.writeLong(789);
			     //dos.writeBoolean(false);
			     //dos.writeChar(90);
				//dos.writeBytes("help");
				dos.writeChars("help");
				//dos.writeUTF("help");
			} catch(FileNotFoundException fnfe) {
				System.err.println("cannot create a file with the given file name ");
			} catch(IOException ioe) {
				System.err.println("an I/O error occurred while processing the file");
			}
			System.out.println();
			
			// the DataOutputStream will auto-close, so don't have to worry about it
			// now, read the written data and print it to console
			try (DataInputStream dis = new DataInputStream(new FileInputStream(fileData))) {
				System.out.println(dis.readUTF());
				//System.out.println(dis.readUTF());
				//System.out.println(dis.readUTF());
				/*
				int x=0;
				while((x=dis.read())!=-1){
					System.out.println((char)x);
				}
				*/
			}
			catch(IOException e){
				e.printStackTrace();
			}		
		}
		else
			System.out.println(fileData.toString() + "moet worden gecreeerd");
		
		System.out.println();
	}
	
	static void dataStreamExample(){
		File fileData = new File("G://data//test.data");
		if(fileData.exists()){
			try (DataOutputStream dos =	new DataOutputStream(new FileOutputStream(fileData))) {
				// write values 1 to 10 as byte, short, int, long, float and double
				// omitting boolean type because an int value cannot
				// be converted to boolean
				for(int i = 0; i < 10; i++) {
					dos.writeByte(i*100000);
					dos.writeShort(i);
					dos.writeInt(i);
					dos.writeLong(i);
					dos.writeFloat(i);
					dos.writeDouble(i);
				}
				dos.writeBoolean(true);
			} catch(FileNotFoundException fnfe) {
				System.err.println("cannot create a file with the given file name ");
			} catch(IOException ioe) {
				System.err.println("an I/O error occurred while processing the file");
			}
			System.out.println();
			
			// the DataOutputStream will auto-close, so don't have to worry about it
			// now, read the written data and print it to console
			try (DataInputStream dis = new DataInputStream(new FileInputStream(fileData))) {
				for(int i = 0; i < 10; i++) {
					// %d is for printing byte, short, int or long
					// %f, %g, or %e is for printing float or double
					// %n is for printing newline
					System.out.printf("%d %d %d %d %g %g %n",
					dis.readByte(),
					dis.readShort(),
					dis.readInt(),
					dis.readLong(),
					dis.readFloat(),
					dis.readDouble());
				}
				System.out.println();
				System.out.println(dis.readLong());
			}
			catch(IOException e){
				e.printStackTrace();
			}		
		}
		else
			System.out.println(fileData.toString() + "moet worden gecreeerd");
		
	}
	
	static void createEmptyDataFile(){
		File dirData = new File("G://data");
		if(!dirData.exists())
			dirData.mkdir();
		
		File fileData = new File("G://data//test.data");
		if(!fileData.exists()){
			try {
				fileData.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			fileData.delete();
			try {
				fileData.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
