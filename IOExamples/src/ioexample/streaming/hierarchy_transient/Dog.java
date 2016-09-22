package ioexample.streaming.hierarchy_transient;

import java.io.Serializable;


public class Dog extends Animal implements Serializable {

	public Dog(String name, int age, Collar collar) {
		super(name, age, collar);
		// TODO Auto-generated constructor stub
	}

}
