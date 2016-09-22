package ioexample;

public class ExampleProgram {

	
	
	public static void main(String[] args) {
		
		ByteStreamExamples bse = new ByteStreamExamples();
		bse.readByteFile();
		
	}
	
	private static void ioreadwriteExamples(){
		IoExamples io = new IoExamples();
		//io.createExistingFile();
		//io.readExistingFile();
		//io.readExistingFileWithBuffer();

		//io.writeToFileBufferedWriter();
		//io.writeToFilePrintWriter();
		io.writeFileTryResource(false);
		io.readFileTryResource();
	}
	
	private static void fileExamples(){
		FileExamples fe = new FileExamples();
		//fe.createMoveCopyFile();
		fe.copyFile();
		
	}

}


