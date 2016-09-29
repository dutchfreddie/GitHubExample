package initblocks.withfields;

public class A {
	
	
	static int i;
	
	
	static{System.out.println("static init 1, class A; i= " + i);}	
	int j = 500;
	{System.out.println("instance init 1, class A; i= " + i + "; j = " + j);}
	
	static{System.out.println("static init 2, class A; i= " + i);}
	
	static{i=60;}
	
	public A ()	{
		i=70;
		System.out.println("constructor, class A");	
		j++;
	}
	
	

}
