package filenioexample.iteratorpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		
		Path path = Paths.get("H://javafolder//github//testing");
		System.out.println("nameCount: " + path.getNameCount());
		Iterator<Path> paths = path.iterator();
		while(paths.hasNext()){
			Path p = paths.next();
			System.out.println(p.getFileName().toString());
		}
		try {
			Path newPath = Files.createDirectories(path);
			System.out.println(newPath.getFileName().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
