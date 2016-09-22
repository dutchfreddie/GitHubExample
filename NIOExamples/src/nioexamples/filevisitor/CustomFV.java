package nioexamples.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class CustomFV implements FileVisitor<Path> {

	private List<Path> listPaths;
	
	public CustomFV(){
		listPaths = new ArrayList<Path>();
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc)
			throws IOException {
		System.out.println("postVisitDirectory");
		System.out.println(dir);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
			throws IOException {
		System.out.println("preVisitDirectory");
		System.out.println(dir);
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr)
			throws IOException {
		System.out.println("visitFile");
		
		if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        listPaths.add(file);
        
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
