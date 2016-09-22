package ioexample.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramWriter {

	public static void main(String[] args) {

		String path = "H://fileFrom4.txt";
		try {
			FileWriter fw = new FileWriter(path,true);
			PrintWriter pw = new PrintWriter(path);
			pw.println();
			pw.write("addedFromPW");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	static void fileWriter(){
		String path = "H://teesst//fileFrom2.txt";
		try {
			FileWriter writer = new FileWriter(path,true);
			String s="added";
			writer.write(s);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void bufferedWriter(){
		String path = "H://fileFrom3.txt";
		try {
			FileWriter writer = new FileWriter(path,true);
			BufferedWriter br = new BufferedWriter(writer);
			String s="addedmore";
			br.write(s);
			br.append(s);
			br.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
