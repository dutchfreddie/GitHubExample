package ioexample.streaming.hierarchy_transient;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ProgramObjectStream {

	private static final String DIR = "G://data";
	private static final String FILE = "G://data//animal.ser";
	
	public static void main(String...strings){
		createEmptyObjectFile();
		writeObject();
		//readObjects();
		//readObjectsByteForByte();
	}
	
	static void readObjectsByteForByte(){
		//not for objects???
		File file = new File(FILE);
		if(file.exists()){
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
				
				int x = 0;
				while((x=ois.read())!=-1){
					System.out.print(x);
				}
				
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	static void readObjects(){
		File file = new File(FILE);
		if(file.exists()){
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
				boolean check = true;
				while(check){
					try{					
						Object obj = ois.readObject();	
						if(obj instanceof Cat){
							Cat cat = (Cat)obj;
							System.out.println(cat);
						}
						else if(obj instanceof Dog){
							Dog dog = (Dog)obj;
							System.out.println(dog);
						}
						else if(obj instanceof Animal){
							System.out.println((Animal)obj);
						}
						else{
							System.out.println("not an animal object");
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
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	static void writeObject(){
		File file = new File(FILE);
		if(file.exists()){
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
				Collar dogC = new Collar(20);
				Collar catC = new Collar(40);
				Dog dog = new Dog("freddie", 44, dogC);
				Cat cat = new Cat("max", 1, catC, false);
				cat.setTestedNurtured("boolean nurturing");
				oos.writeObject(dog);
				oos.writeObject(cat);
				oos.writeInt(200);
				//oos.writeObject(cat);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	static void createEmptyObjectFile(){
		File dirData = new File(DIR);
		if(!dirData.exists())
			dirData.mkdir();
		
		File fileData = new File(FILE);
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
