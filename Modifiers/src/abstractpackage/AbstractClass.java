package abstractpackage;

import interfacepackage.SubInterface;

public abstract class AbstractClass implements SubInterface{
	
	private String textClass = "help";
	private String text;
	
	public abstract void returnText();
	
	public AbstractClass(String text){
		this.text=text;
	}
	
	public void returnTextImpl(){
		System.out.println("vanuit abstractClass: " + textClass);
	}

}
