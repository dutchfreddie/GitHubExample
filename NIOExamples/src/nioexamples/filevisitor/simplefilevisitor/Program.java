package nioexamples.filevisitor.simplefilevisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		String pattern = "*.pdf";
		String root = "G://Tutorials";
		String destination = "F://destination";
		Path rootPath = Paths.get(root);
		CopyFileVisitor cfv = new CopyFileVisitor(pattern,destination);
		try {
			Path p = Files.walkFileTree(rootPath, cfv);
			System.out.println(p.getFileName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<Path> pdfs = cfv.getList();
		System.out.println(pdfs.size());
		for(Path p:pdfs){
			System.out.println(p);		
			
		}

	}

}
