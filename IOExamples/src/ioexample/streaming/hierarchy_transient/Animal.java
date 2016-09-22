package ioexample.streaming.hierarchy_transient;

import java.io.Serializable;


public class Animal implements Serializable{

	private String name;
	private int age;
	private Collar collar;
	
	
	public Animal(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	public Animal(String name, int age,Collar collar){
		this(name,age);
		this.setCollar(collar);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}	

	public void setAge(int age) {
		this.age = age;
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	
	@Override
	public String toString(){
		return name + "; " + age + "; "+ collar.toString();
	}
}
