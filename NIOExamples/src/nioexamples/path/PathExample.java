package nioexamples.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class PathExample {
	
	private static String oldDir = "G://SunCertif_WorkSpace//Chapter6//files//oldDir//";
	private static String newDir = "G://SunCertif_WorkSpace//Chapter6//files//newDir//";
	private static String existingFile = "oldFile.txt";
	private static String renameFile = "renameFile.txt";
	private static String moveFile = "moveFile.txt";
	private static String copyFile = "copyFile.txt";
	
	private static String existingDir="G://SunCertif_WorkSpace//Chapter6//files//existing2Dir";
	
	
	
	public void createExistingDirectory(){
		Path path = Paths.get(existingDir);
		boolean exists = Files.exists(path);
		System.out.println(exists);
		try {
			Files.createDirectory(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createAndWriteTo(){
		
		Path path = Paths.get(oldDir+existingFile);
		boolean exists = Files.exists(path);
		System.out.println(exists);
		if(!exists){
			try {
				Files.createFile(path);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else{
			try {
				Files.delete(path);
				Files.createFile(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try(BufferedWriter br = Files.newBufferedWriter(path,StandardCharsets.UTF_8)){
			br.write("Test"); br.newLine();br.write("Test2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path path2= Paths.get(newDir+existingFile);
		try(BufferedWriter br =Files.newBufferedWriter(path2,StandardCharsets.UTF_8,StandardOpenOption.APPEND)){
			br.write("Test"); br.newLine();br.write("Test2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void metaDataExample(){
		
		Path path = Paths.get(oldDir+existingFile);
		
		try {
			Map<String,Object> map = Files.readAttributes(path, "*");
			BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
			
			for(Map.Entry<String, Object> mp:map.entrySet()){
				String key = mp.getKey();
				Object value = mp.getValue();
				if(value instanceof String){
					
				}
				
				System.out.println(key + "\t" + value);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
