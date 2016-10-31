package nioexamples.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Program {

	
	
	public static void main(String[] args) {

		String dir ="G://Test//subTest";
		Path path = Paths.get(dir);
		FileVisitorDirectories fvd = new FileVisitorDirectories();
		
		try {
			Path p =Files.walkFileTree(path, fvd);
			List<Path> allDir = fvd.getAllPath();
			for(Path d:allDir){
				System.out.println(d.toAbsolutePath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	static void exampleFVwithCopy(){
		String oldDir = "G://CopyTest";
		String newDir = "";
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
