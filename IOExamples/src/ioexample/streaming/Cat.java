package ioexample.streaming;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cat implements Serializable{

	private String name;
	private int age;
	private Collar collar;
	
	
	public Cat(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	public Cat(String name, Collar collar){
		this.name = name;
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
	
	
	
	
	
}
