package ioexample.streaming.inheritance;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	
	private boolean isGemeen;
	
	public Dog(int age){
		super(age);
	}
	
	public Dog(int age,boolean isGemeen){
		this(age);
		this.setGemeen(isGemeen);
	}
	
	public boolean isGemeen() {
		return isGemeen;
	}
	
	public void setGemeen(boolean isGemeen) {
		this.isGemeen = isGemeen;
	}
}
