package ioexample.streaming.inheritance;

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
	private static String serFile = "oopInh.ser";
	private static String serFile2 = "oopInh2.ser";
	
	public void writeToSer(){
		File fDir = new File(dir);
		File fFile = new File(fDir,serFile2);
		
		Animal c1 = new Cat("fred", 50);
		Animal c2 = new Cat("isa", 40);
		Animal c3 = new Cat(100);
		Animal d1 = new Dog(200, false);
		Animal d2 = new Dog(300);
		ObjectOutputStream oos = null;
		try {
			fFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(fFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(c2);	
			oos.writeObject(c3);
			oos.writeObject(d1);
			oos.writeObject(d2);
		} catch (IOException e) {
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
						System.out.println("Cat: " + age + " " + name);						
					}
					if(obj instanceof Dog){
						Dog d = (Dog)obj;
						System.out.println("Dog: " + d.getAge() + " " + d.isGemeen());
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
