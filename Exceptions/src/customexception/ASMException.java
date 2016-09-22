package customexception;

public class ASMException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int sizeA;
	private  int sizeB;
	
	public ASMException(String msg) {
		super(msg);
	}
	
	public ASMException(){
		
	}
	
	public ASMException (int sizeA,int sizeB){
		this.sizeA=sizeA;
		this.sizeB=sizeB;
	}
	
	public  ASMException(String msg,int sizeA,int sizeB) {
		super(msg);
		this.sizeA=sizeA;
		this.sizeB=sizeB;
	}
	
	

	@Override
	public void printStackTrace(){
		super.printStackTrace();
		System.out.println("Array A: " + sizeA + "\nArray B: " + sizeB + ";");
	}
	
	@Override
	public String toString(){
		return this.getMessage() + " array A: " + sizeA + " array B: " + sizeB + ";";
	}
}
