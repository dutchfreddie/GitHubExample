package nioexamples.filevisitor;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

import static java.nio.file.FileVisitResult.*;
import static java.nio.file.FileVisitOption.*;

import java.util.*;

public class Find {

	/**
     * A {@code FileVisitor} that finds
     * all files that match the
     * specified pattern.
     */
    public static class Finder extends SimpleFileVisitor<Path> {
 
        private final PathMatcher matcher;
        private int numMatches = 0;
        private List<Path> listPaths;
 
        Finder(String pattern) {
        	//String pt = "glob:" + pattern;
        	String pt = "regex:" +pattern;
        	
            matcher = FileSystems.getDefault().getPathMatcher(pt);
            listPaths = new ArrayList<Path>();
        }
 
        // Compares the glob pattern against the file or directory name.
        void find(Path file) {
            Path name = file.getFileName();
            if (name != null && matcher.matches(name)) {
                numMatches++;
                System.out.println(file);
                listPaths.add(name);
            }
        }
 
        // Prints the total number of matches to standard out.
        void done() {
            System.out.println("Matched: "
                + numMatches);
        }
 
        // Invoke the pattern matching method on each file.
        @Override
        public FileVisitResult visitFile(Path file,
                BasicFileAttributes attrs) {
            find(file);
            return CONTINUE;
        }
 
        // Invoke the pattern matching method on each directory.
        @Override
        public FileVisitResult preVisitDirectory(Path dir,
                BasicFileAttributes attrs) {
            find(dir);
            return CONTINUE;
        }
 
        @Override
        public FileVisitResult visitFileFailed(Path file,
                IOException exc) {
            System.err.println(exc);
            return CONTINUE;
        }
        
        public List<Path> getAllPath(){
    		return listPaths;
    	}
    }
 
    static void usage() {
        System.err.println("java Find <path>" +
            " -name \"<glob_pattern>\"");
        System.exit(-1);
    }
 
    public static void main(String[] args)
        throws IOException {        
 
        Path startingDir = Paths.get("G://Tutorials");
        String pattern = "\\w*.(pdf)*(doc)*";
 
        Finder finder = new Finder(pattern);
        Files.walkFileTree(startingDir, finder);
        List<Path> paths = finder.getAllPath();
		for(Path pt:paths){
			System.out.println(pt);
		}
        finder.done();
    }
	
}
