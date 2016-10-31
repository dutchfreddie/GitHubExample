package nioexamples.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class ProgramPathInfo {

	public static void main(String[] args) {
		
		String fileName = "G://Test//Dir1//jpg//index.jpg";
		pathInfoExample(fileName);
		//resolvePath(Paths.get(fileName), Paths.get("G://Resized"));
	}
	
	static void relativeResolveExample(){
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
	
	static void resolvePath(Path oldPath, Path dirNew){
		printOutString(oldPath.toString());
		printOutString(dirNew.toString());
		Path subOld = oldPath.getRoot().resolve(oldPath.getName(0)).relativize(oldPath);
		System.out.println(subOld.toString());
		Path newPath = dirNew.resolve(subOld);
		System.out.println(newPath.toString());
		System.out.println(newPath.getParent().toString());
		
		
		
		Path resolved = dirNew.getRoot().resolve(oldPath);
		System.out.println(resolved.toString());
		Path testRoot = oldPath.getRoot().resolve(oldPath.getName(0));
		printOutString(testRoot.toString());
		Path subNew = testRoot.relativize(oldPath);
		printOutString(subNew.toString());
		Path newPath2 = dirNew.resolve(subNew);
		printOutString(newPath2.toString());
	}
	
	static void pathInfoExample(String fileName){
		
		Path path = Paths.get(fileName);
		printOutString("filename\t" + path.getFileName());
		System.out.println(path.getFileName().toString().endsWith("//.jpg"));
		printOutString("parent\t" + path.getParent());
		printOutString("root\t" + path.getRoot());
		
		printOutString("absolut path\t" + path.toAbsolutePath());
		printOutString("toString\t" + path.toString());
		printOutString("isAbsolute\t" + path.isAbsolute());
		printOutString("namecount\t" + path.getNameCount());
		for(int i=0;i<path.getNameCount();i++){
			printOutString("index name " + i + "\t" + path.getName(i));
		}
		
		
		
		System.out.println("\tFiles:");
		printOutString("isDirectory\t" + Files.isDirectory(path));
		printOutString("isRegularFile\t" + Files.isRegularFile(path));
		printOutString("nonExist\t" + Files.notExists(path));
		try {
			printOutString("isSameFile\t" + Files.isSameFile(path, path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printOutString("isExecutable\t" + Files.isExecutable(path));
		try {
			printOutString("isHidden\t" + Files.isHidden(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printOutString("isReadable\t" + Files.isReadable(path));
		try {
			printOutString("size\t" + Files.size(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\treadAttributes:");
		try {
			Map<String,Object> map = Files.readAttributes(path, "*");
			BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
			
			for(Map.Entry<String, Object> mp:map.entrySet()){
				String key = mp.getKey();
				Object value = mp.getValue();				
				System.out.println(key + "\t" + value);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//printOutString("\t" + path.);
		
	}
	
	static void printOutString(String s){
		System.out.println(s);
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
