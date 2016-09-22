package nioexamples.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Program {

	private static String oldDir = "G://CopyTest";
	private static String newDir = "";
	
	public static void main(String[] args) {

		FileVisitorCopy fvc = new FileVisitorCopy();
		Path path = Paths.get(oldDir);
		
		try {
			Path p = Files.walkFileTree(path, fvc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
