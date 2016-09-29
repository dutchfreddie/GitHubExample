package overloading.constructor;

import java.io.IOException;

public class A{

	private int i;
	private long l;
	String s;
	
	public A(int i){
		this.i=i;
	}
	
	A(int i,long l) throws IOException{
		this(i);
		this.l=l;
	}
	
	public A(int i,long l,String s) throws IOException{
		this(i,l);
		this.s=s;
		if(i==4)
			return;
	}
	

}
