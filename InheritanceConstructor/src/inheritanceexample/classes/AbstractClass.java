package inheritanceexample.classes;

import inheritanceexample.interfaces.ISubClass;

public abstract class AbstractClass implements ISubClass {

	private String name;
	
	public AbstractClass(String name){
		this.name=name;
	}
	
	public abstract void doStuff();
	
	public void nonAbstractDoStuff(){
		System.out.println("test");
	}
	
	public void nonAbstractDoStuff2(){
		nonAbstractPrivateDoStuff2();
	}
	
	private void nonAbstractPrivateDoStuff2(){
		System.out.println("test from private");
	}

}
