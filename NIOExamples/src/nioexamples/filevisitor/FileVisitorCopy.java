package nioexamples.filevisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorCopy implements FileVisitor<Path> {

	private static String oldDir = "G://Opslag//CopyTest";
	private static String newDir = "";
	private int xDir =1;
	private int xFile=1;
	
	
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes arg1)
			throws IOException {
		System.out.println("/n****preVisitDirectory****/n");
		System.out.println(xDir + ": " +dir);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException arg1)
			throws IOException {
		System.out.println("/n****postVisitDirectory****n/");
		System.out.println(xDir + ": " + dir);
		xDir++;
		xFile=1;
		return FileVisitResult.CONTINUE;
	}	

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes arg1)
			throws IOException {
		System.out.println("/n****visit file in " + path.getParent() + "****n/");
		System.out.println(xFile + ": " + path);
		xFile++;
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException arg1)
			throws IOException {
		
		return FileVisitResult.CONTINUE;
	}

}
