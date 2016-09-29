package overloading.constructor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class B extends A{

	private B(int i, long l) throws IOException,ParseException {
		super(i, l);
		
	}

}
