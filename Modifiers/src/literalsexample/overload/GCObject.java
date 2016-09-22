package literalsexample.overload;

public class GCObject {
	
	public void finalize(){
		System.out.println("Test");
	}
	
	public void test(){
		System.out.println("test");
	}

}
