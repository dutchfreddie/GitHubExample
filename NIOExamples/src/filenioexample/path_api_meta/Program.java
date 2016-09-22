package filenioexample.path_api_meta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {
		
		Path path1 = Paths.get("H://moveFile");
		Path path2 = Paths.get("moveFile3");
		Path path = path1.resolve(path2);
		
		System.out.println(path.toAbsolutePath());
		
		
		if(Files.exists(path)){
			printOut("FileName",path.getFileName().toString());
			printOut("Name",path.getName(path.getNameCount()-1).toString());
			printOut("ToAbsolutP",path.toAbsolutePath().toString());
			printOut("ToURI",path.toUri().toString());
			printOut("FileSystem",path.getFileSystem().toString());
			printOut("Parent",path.getParent().toString());
			printOut("Root",path.getRoot().toString());
			printOut("Normalize",path.normalize().toString());
			
		}
		if(Files.isSymbolicLink(path)){
			try {
				printOut("Regular link",Files.readSymbolicLink(path).toAbsolutePath().toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void pathMetaData(){
		Path path = Paths.get("H://moveFile//FileFromSymbolic.txt");
		if(Files.exists(path)){
			printOut("FileName",path.getFileName().toString());
			printOut("Name",path.getName(path.getNameCount()-1).toString());
			printOut("ToAbsolutP",path.toAbsolutePath().toString());
			printOut("ToURI",path.toUri().toString());
			printOut("FileSystem",path.getFileSystem().toString());
			printOut("Parent",path.getParent().toString());
			printOut("Root",path.getRoot().toString());
			printOut("Normalize",path.normalize().toString());
			
		}
		if(Files.isSymbolicLink(path)){
			try {
				printOut("Regular link",Files.readSymbolicLink(path).toAbsolutePath().toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void printOut(String key,String value){
		System.out.println(key + "\t" + value);
	}

}
