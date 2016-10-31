package nioexamples.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileVisitorDirectories implements FileVisitor<Path> {

private List<Path> listPaths;
	
	public FileVisitorDirectories(){
		listPaths = new ArrayList<Path>();
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc)
			throws IOException {
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
			throws IOException {
		listPaths.add(dir);
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr)
			throws IOException {
		
        
        return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc)
			throws IOException {
		System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
	
	
	public List<Path> getAllPath(){
		return listPaths;
	}


}
