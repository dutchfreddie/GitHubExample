package literalexample.varargs;

public class A {

	private int[] array;
	private String s;
	
	public A(String s, int... array){
		this.s=s;
		this.array=array;
	}
	
	
	public void getVarArgsArray(){
		for(int i:array)
			System.out.print(i + " ");
			
	}
}
