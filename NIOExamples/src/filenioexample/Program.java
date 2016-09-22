package filenioexample;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {
		/*
		String fileIn= "F:\\kenmerkenCorrecties\\test\\test.txt";
		String fileOut = "F:\\kenmerkenCorrecties\\test\\text2.txt";
		NioClass nc = new NioClass(fileIn,fileOut);
		nc.openReadFile();

		Path p = Paths.get("G:\\EclipseTutorial");
		PrintFiles pf = new PrintFiles();
		try {
			Path puit = Files.walkFileTree(p, pf);
			System.out.println(puit.getFileName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PathMatcher matcher =
			    FileSystems.getDefault().getPathMatcher("*.pdf}");

			Path filename = Paths.get("G:\\EclipseTutorial") ;
			if (matcher.matches(filename)) {
			    System.out.println(filename);
			}
			else{
				System.out.println(false);
			}
				}

*/
		Path p = Paths.get("G:\\");
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(p)) {
            for (Path path : directoryStream) {
                System.out.println(path.getFileName() + ": " + Files.probeContentType(path));
            }
        } catch (IOException ex) {}
       System.out.println("");
		Iterable<FileStore> store = FileSystems.getDefault().getFileStores();
		for(FileStore st:store){
			System.out.println(st.name());
		}
	}
}
