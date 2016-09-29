package accessmodifer.methods.main;

import accessmodifier.methods.Car;

public class Convertible extends Car{

	public Convertible(String nameCar) {
		super(nameCar);		
	}
	
	
	@Override
	public void returnPublicCar(){
		super.returnPublicCar();
		System.out.println("From Convertible-public-override: De naam van de car is " + nameCar);
	}
	/*
	@Override
	protected void returnProtectedCar(){
		super.returnProtectedCar();
		System.out.println("From Convertible-protected-override: De naam van de car is " + nameCar);
	}
	*/
	
	protected void returnProtectedConvertible(){
		super.returnProtectedCar();
		System.out.println("From Convertible-protected: De naam van de car is " + nameCar);
	}
	
	/*
	@Override
	protected void testAccesOverloading(){
		
	}
	*/
	
	public static void testAccessStaticOverloading(){
		//super.testAccessStaticOverloading();
	}
	
	

}
