package nioexamples.filevisitor;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CustomFileVisitor extends SimpleFileVisitor<Path> {

	/*
	 // Print information about each type of file.
    @Override
    public FileVisitResult visitFile(Path file,
                                   BasicFileAttributes attr) {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return FileVisitResult.CONTINUE
;        		
    }
    */

	
}
