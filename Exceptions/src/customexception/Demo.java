package customexception;

import java.io.IOException;

public class Demo {

	private int[] sizeA;
	private int[] sizeB;
	
	
	public Demo(int[] sizeA,int[] sizeB){
		this.sizeA=sizeA;
		this.sizeB=sizeB;
	}
	
	public boolean absCompare() throws ASMException{
		if (sizeA.length!=sizeB.length)
			throw new ASMException("een mismatch in grootte",sizeA.length, sizeB.length);
		
			
		return true;
	}
	
	public boolean absCompare2(){
		if (sizeA.length!=sizeB.length)
			try {
				throw new ASMException("een mismatch in grootte",sizeA.length, sizeB.length);
			} catch (ASMException e) {
				
				e.printStackTrace();
			}
			
		return true;
	}
	
	public boolean absCompare3() throws ASMException{
		if (sizeA.length!=sizeB.length)
			throw new ASMException();
			
		return true;
	}
	
	public void test() throws Exception{
		if (sizeA.length!=sizeB.length)
			throw new IOException();
	}
	

}
