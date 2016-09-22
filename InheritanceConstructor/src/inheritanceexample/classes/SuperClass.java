package inheritanceexample.classes;

import inheritanceexample.interfaces.ISuperClass;

public class SuperClass implements ISuperClass{

	private int instVarInt;
	private String instVarString;
	
	public SuperClass(){}
	
	public SuperClass(int instVarInt, String instVarString){
		this.instVarInt = instVarInt;
		this.instVarString = instVarString;
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Execute m1 vanuit de SuperClass");
	}

	@Override
	public void m2(int i2) {
		// TODO Auto-generated method stub
		System.out.println("Execute m2 vanuit de SuperClass");
	}

	@Override
	public void m5() {
		System.out.println("Execute m5 vanuit de SuperClass");		
	}

}
