package nioexamples.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramPathInfo {

	public static void main(String[] args) {
		
		String link1a = "G://DirA1//DirA2//DirA4";
		String link1b = "G://DirA1//DirA2//DirA3";
		String link2 = "G://DirB2";
		String fileLink = "test.txt";
		
		Path path1a = Paths.get(link1a);
		Path path1b = Paths.get(link1b);
		Path path2 = Paths.get(link2);
		Path pathFile = Paths.get(fileLink);
		
		printoutFileStructure(path1a);
		printoutFileStructure(path1b);
		printoutFileStructure(path2);
		
		resolvePaths(path1b, path1a);
		resolvePaths(path1a,path1b);
		System.out.println();
		relativizePaths(pathFile, path2);
	}
	
	static void printoutFileStructure(Path path){
		System.out.println(path.getFileName() + "\t" + path.getParent() + "\t" + path.getRoot());
	}
	
	static void resolvePaths(Path path1,Path path2){
		System.out.println(path1 + " resolve with " + path2 + ":\t" + path1.resolve(path2));
	}
	
	static void relativizePaths(Path path1,Path path2){
		System.out.println(path1 + " re with " + path2 + ":\t" + path1.relativize(path2));
	}
	
	
	
	 static void copyFileToDifferentDir(){
		 String ps1 = "G://moveFrom//from.txt";
			String ps2 = "G://moveTo";
			
			Path p1 = Paths.get(ps1);
			
			Path p1Dir = p1.getParent();
			try {
				Files.createDirectories(p1Dir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Path p1File = p1.getFileName();
			
			Path p1Resolve = p1Dir.resolve(p1File);
			
			try {
				Files.createFile(p1Resolve);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Path p2 = Paths.get(ps2);
			
			try {
				Files.createDirectories(p2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Path p1ResolveFile = p1Resolve.getFileName();
			Path p2Resolve = p2.resolve(p1ResolveFile);
			
			try {
				Files.copy(p1Resolve, p2Resolve);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }

}
