package simpleexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReturnFromCatchBlock {

	public static void main(String args[]) {
		//openFile();
		ReturnFromCatchBlock r = new ReturnFromCatchBlock();
		System.out.println(r.getInt2());
	}
	
	private static void openFile() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("file not found");
			return;
		}
		finally {
			System.out.println("finally");
			}
		System.out.println("Next task..");
	}
	
	int getInt() {
		int returnVal = 10;
		try {
			String[] students = {"Harry", "Paul"};
			System.out.println(students[5]);
		}
		catch (Exception e) {
			returnVal += 10;
			System.out.println("About to return :" + returnVal);
			return returnVal;
		}
		finally {
			returnVal += 10;
			System.out.println("Return value is now :" + returnVal);
			return returnVal;
		}
		//return returnVal;
	}
	
	int getInt2(){
		int returnVal = 10;
		try {
			String[] students = {"Harry", "Paul"};
			System.out.println(students[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			returnVal += 20;
			System.out.println("From Array Out :" + returnVal);
		}
		catch (Exception e) {
			returnVal += 10;
			System.out.println("From Exception  :" + returnVal);
			
		}
		finally {
			returnVal += 10;
			System.out.println("From Finally :" + returnVal);
		}
		
		return returnVal;
	}
}
