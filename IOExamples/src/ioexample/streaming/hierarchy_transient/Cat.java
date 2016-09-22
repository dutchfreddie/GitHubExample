package ioexample.streaming.hierarchy_transient;

import java.io.Serializable;


public class Cat extends Animal implements Serializable {

	private transient boolean isNurtured;
	private String testedNurtured;
	
	public Cat(String name, int age, Collar collar) {
		super(name, age, collar);
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age, Collar collar, boolean isNurtured) {
		this(name, age, collar);
		this.isNurtured=isNurtured;		
		// TODO Auto-generated constructor stub
	}

	public boolean isNurtured() {
		return isNurtured;
	}

	public void setNurtured(boolean isNurtured) {
		this.isNurtured = isNurtured;
	}

	public String getTestedNurtured() {
		return testedNurtured;
	}

	public void setTestedNurtured(String testedNurtured) {
		this.testedNurtured = testedNurtured + " is " + isNurtured;
	}
	
	@Override
	public String toString(){
		String s = super.toString();
		s = s + "; " + testedNurtured;
		return s;
	}

}
