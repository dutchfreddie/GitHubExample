package filenioexample.filesapi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Map;
import java.util.Map.Entry;

public class Program {

	public static void main(String[] args) {
		
		symbolicLinks();
	}
	
	static void deleteFile(){
		Path path = Paths.get("H://FileFrom.txt");
		/*
		if(Files.exists(path))
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		try {
			System.out.println(Files.deleteIfExists(path));
			Files.delete(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void deleteDirectory(){
		Path path = Paths.get("H://moveFile");
		/*
		if(Files.exists(path))
			try {
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		try {
			System.out.println(Files.deleteIfExists(path));
			Files.delete(path);
		}
		catch(DirectoryNotEmptyException e){
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void readTextFile(){
		Path path = Paths.get("H://FileFrom.txt");
		System.out.println(Files.isSymbolicLink(path));
		try(BufferedReader br = Files.newBufferedReader(path,null)){
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void writeToFile(){
		String[] array = {"fred","isa","mich","moe"};
		Path path = Paths.get("H://FileFrom.txt");
		if(!Files.exists(path))
			try {
				Files.createFile(path);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		try(BufferedWriter bw = Files.newBufferedWriter(path, null, null)){
			for(String s:array){
				bw.write(s);bw.newLine();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void readByteStream(){

		Path path = Paths.get("H://FileFrom88.txt");
		
		try(InputStream is = Files.newInputStream(path)){
			int i=-1;
			while((i=is.read())!=-1){
				System.out.print(i);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void getters(){
		
		Path path = Paths.get("H://FileFrom.txt");
		
		try{
			BasicFileAttributes map = Files.readAttributes(path, BasicFileAttributes.class);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static void symbolicLinks(){

		Path pathRegular = Paths.get("H://FileFrom.txt");
		Path pathSymbolic = Paths.get("H://moveFile//FileFromSymbolic.txt");
		System.out.println(Files.exists(pathSymbolic,LinkOption.NOFOLLOW_LINKS));
		System.out.println(Files.exists(pathRegular));
		if(!Files.exists(pathSymbolic)){
			try {
				Files.createSymbolicLink(pathSymbolic, pathRegular);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Files.isSymbolicLink(pathSymbolic));
		System.out.println(Files.isSymbolicLink(pathRegular));
		try {
			System.out.println(Files.isSameFile(pathRegular, pathSymbolic));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
	}
	
	
	

}
