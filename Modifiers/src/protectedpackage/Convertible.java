package protectedpackage;

import defaultpackage.Car;

public class Convertible extends Car{

	public Convertible(String nameCar) {
		super(nameCar);		
	}
	
	@Override
	public void returnPublicCar(){
		super.returnPublicCar();;
		System.out.println("From Convertible-public: De naam van de car is " + nameCar);
	}
	
	@Override
	protected void returnProtectedCar(){
		super.returnProtectedCar();
		System.out.println("From Car-protected: De naam van de car is " + nameCar);
	}
	
	

}
