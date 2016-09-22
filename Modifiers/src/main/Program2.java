package main;

import protectedpackage.Convertible;
import static defaultpackage.Car.*;
import defaultpackage.Car;


public class Program2 {

	public static void main(String[] args) {
		
		Car c = new Convertible("BMW");
		c.returnPublicCar();
		
		Car c2 = new Car("");
		
		
	}
	
	private static void protectedExample(){
		
		Car c = new Car();
		
	}

}
