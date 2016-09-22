package exceptions.stack;

public class A {

	public int m1(int x) {
		m2(x);
		
		return x;
	}
	
	public void m2(int x){
		m3(x);
	}
	
	public void m3(int x){
		int y = 10/x;
	}
}

