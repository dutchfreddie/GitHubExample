package filenioexample;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;

public class NioClass {

	private String fileIn;
	private String fileOut;
	
	public NioClass(String fileIn,String fileOut){
		this.fileIn = fileIn;
		this.fileOut = fileOut;
	}
	
	public void openReadFile(){
		File f = new File(fileIn);
		Path p = f.toPath();
		Path p2 = Paths.get(fileOut);
		
		for(Path n:p)
			System.out.println(n);
		
		
		BasicFileAttributes attr;
		try {
			attr = Files.readAttributes(p, BasicFileAttributes.class);
			System.out.println("creationTime: " + attr.creationTime());
			System.out.println("lastAccessTime: " + attr.lastAccessTime());
			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

			System.out.println("isDirectory: " + attr.isDirectory());
			System.out.println("isOther: " + attr.isOther());
			System.out.println("isRegularFile: " + attr.isRegularFile());
			System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
			System.out.println("size: " + attr.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = Files.newBufferedWriter(p,StandardCharsets.US_ASCII, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND)){
			
		}
		catch(IOException e){
			
		}
		
		String[] list = {"1","2","3"};
		List<String> s = Arrays.asList(list);
		try {
			Files.write(p, s, StandardCharsets.UTF_8,StandardOpenOption.WRITE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			byte[] bytes = "Help".getBytes();
			OutputStream out = Files.newOutputStream(p2, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
			out.write(bytes,0,bytes.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Defaults to READ
		try (SeekableByteChannel sbc = Files.newByteChannel(p2)) {
		    ByteBuffer buf = ByteBuffer.allocate(20);

		    // Read the bytes with the proper encoding for this platform.  If
		    // you skip this step, you might see something that looks like
		    // Chinese characters when you expect Latin-style characters.
		    String encoding = System.getProperty("file.encoding");
		    while (sbc.read(buf) > 0) {
		        buf.rewind();
		        System.out.print(Charset.forName(encoding).decode(buf));
		        buf.flip();
		    }
		} catch (IOException x) {
		    System.out.println("caught exception: " + x);
		}
		
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name: dirs) {
		    System.err.println(name);
		}
	}
}
