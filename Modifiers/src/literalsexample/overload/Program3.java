package literalsexample.overload;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCObject gc = new GCObject();
		gc.test();
		//gc.finalize();
		gc= null;
		gc= new GCObject();
		gc.test();
		
		
	}

}
