package exceptions.more;

import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A {

	@Override
	public void throwIOException() throws FileNotFoundException, IOException{
		super.throwIOException();
	}
	
	@Override
	public void throwException(){
		
	}
	
	public void superNoSuperMethod(){
		super.superNoSuperMethod();
	}

}
