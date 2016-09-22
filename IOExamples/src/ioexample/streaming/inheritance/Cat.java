package ioexample.streaming.inheritance;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat extends Animal implements Serializable{

	private String name;
	
	public Cat(int age){
		super(age);
	}
	
	public Cat(String name, int age) {
		this(age);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}
