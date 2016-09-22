package constructorexample.vararg;

public class VarargTest {
	
	private String s;
	private int[] x;
	
	public VarargTest(String s, int... x){
		this.s=s;
		this.x=x;		
	}
	
	
	
	public void printOut(){
		System.out.println(s);
		for(int i:x){
			System.out.println(i);			
		}

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

	}

}
