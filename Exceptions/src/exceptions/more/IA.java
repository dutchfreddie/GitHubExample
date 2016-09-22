package exceptions.more;

import java.io.IOException;

public interface IA {

	public void throwIOException() throws IOException;
	
	public void throwException();
	
	public void throwsMyException(int x) throws MyException;
}
