package ioexample.streaming.inheritance;

import java.io.Serializable;

public class Animal implements Serializable {

	
	protected int age;
		
	
	public Animal(int age){
		this.age=age;;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}
