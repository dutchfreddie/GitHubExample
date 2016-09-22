package nioexamples.filevisitor.simplefilevisitor;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class CopyFileVisitor implements FileVisitor<Path> {

	private PathMatcher matcher;
    private List<Path> listPaths;
    private Path destination;
    
    CopyFileVisitor(String pattern,String destinationPath) {
    	String pt = "glob:" + pattern;
    	//String pt = "regex:" +pattern;
    	
        matcher = FileSystems.getDefault().getPathMatcher(pt);
        listPaths = new ArrayList<Path>();
        destination = Paths.get(destinationPath);
        try {
			Files.createDirectories(destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	
	@Override
	public FileVisitResult postVisitDirectory(Path path, IOException arg1) throws IOException {
		System.out.println("postVisitDirectory");
		System.out.println(path);
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes arg1) throws IOException {
		System.out.println("preVisitDirectory");
		if(arg1.isDirectory())
			System.out.println(path);
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes arg1) throws IOException {
		
		System.out.println("visitFile");
		
		if(arg1.isRegularFile()){
			 Path name = path.getFileName();
			 Path parent = path.getParent();
			 Path pathRel = parent.relativize(path);
			 Path destinationResolve = destination.resolve(pathRel);
			 
	            if (name != null && matcher.matches(name)) {	
	            	Files.copy(path, destinationResolve,StandardCopyOption.REPLACE_EXISTING);
	                listPaths.add(path);                
	            }
		}
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path arg0, IOException arg1) throws IOException {
		
		return FileVisitResult.CONTINUE;
	}
	
	public List<Path> getList(){
		return listPaths;
	}

}
