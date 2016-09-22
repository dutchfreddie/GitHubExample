package daodpexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileDAO implements IShapeDao {

	@Override
	public void insertShape(IShapeTransfer circle) {
		
		Path path = Paths.get("G://testIn.txt");
		
		try(BufferedWriter bw = Files.newBufferedWriter(path,StandardCharsets.UTF_8	,StandardOpenOption.APPEND)){
			bw.write("begin toevoeging circle");
			bw.newLine();
			bw.write("radius:  " + circle.getRadius());
			bw.newLine();
			bw.write("xPos:  " + circle.getxPos() + "\n");
			bw.newLine();
			bw.write("yPos:  " + circle.getyPos() + "\n");
			bw.write("end toevoeging circle\n");
			bw.newLine();
			}
		catch(IOException e){
			
		}
		/*
		try(PrintWriter pw = new PrintWriter(new File("G://testIn.txt"))){
			pw.println("begin toevoeging circle");
		}
		catch(IOException e){
			
		}
		*/

	}

	@Override
	public IShapeTransfer findShape(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteShape(int id) {
		// TODO Auto-generated method stub

	}

}
