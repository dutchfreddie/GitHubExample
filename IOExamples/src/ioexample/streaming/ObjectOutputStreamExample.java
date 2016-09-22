package ioexample.streaming;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamExample {

	private static String dir = "G://SunCertif_WorkSpace//Chapter6//files//";
	private static String serFile = "oop.ser";
	private static String serFile2 = "oop2.ser";
	
	public void writeToSer(){
		File fDir = new File(dir);
		File fFile = new File(fDir,serFile);
		Cat c1 = new Cat("fred", 50);
		Cat c2 = new Cat("isa", 40);
		ObjectOutputStream oos = null;
		try {
			fFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(fFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(c2);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
	
	public void writeToSer2(){
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir+serFile2,true))){
			Collar csc1 = new Collar(20);
			Collar csc2 = new Collar(40);
			Cat c1 = new Cat("fred", csc1);
			Cat c2 = new Cat("isa", csc2);
			oos.writeObject(c1);
			oos.writeObject(c2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromSer(){
		try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream(dir+serFile2))){
			boolean check = true;
			while(check){
				try{					
					Object obj = ios.readObject();	
					if(obj instanceof Cat){
						Cat c = (Cat)obj;
						String name = c.getName();
						int age = c.getAge();
						Collar col = null;
						if(c.getCollar()!=null){
							col = c.getCollar();							
						}
						if(col!=null){
							System.out.println("Cat: " + age + " " + name + " " + col.getSizeCollar());
						}
						else{
							System.out.println("Cat: " + age + " " + name);
						}
					}
				}
				catch(EOFException e){
					e.printStackTrace();
					check = false;
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
