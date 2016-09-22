package nioexamples.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExample {

	public static void main(String[] args) {
		
		String pathFrom = "G://moveFrom//from.txt";
		String dirTo = "G://moveTo2//Extra";
		
		Path to = Paths.get(dirTo);
		Path from = Paths.get(pathFrom);
		Path parentFrom = from.getParent();
		
		try {
			parentFrom = from.getParent();
			Files.createDirectories(parentFrom);
			Files.createDirectories(to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Path parentFromRelativise = parentFrom.relativize(from);
		Path toResolve =to.resolve(parentFromRelativise);
		
		
		
		System.out.println(from);
		System.out.println(to);
		System.out.println(parentFromRelativise);
		System.out.println(parentFrom);
		System.out.println(toResolve);
		
		try {
			System.out.println(Files.exists(toResolve));
			//Files.copy(from, toResolve,StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
