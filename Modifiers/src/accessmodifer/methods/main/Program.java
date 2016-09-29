package accessmodifer.methods.main;

import accessmodifier.methods.Car;

public class Program {

	public static void main(String[] args) {
		
		Car car = new Car("car");
		car.returnPublicCar();
		//car.returnProtectedCar();
		
		Convertible conv = new Convertible("convertible");
		conv.returnPublicCar();
		//conv.returnProtectedCar();
		conv.returnProtectedConvertible();
		
		/*
		 From Car-public: De naam van de car is car
		 
		From Car-public: De naam van de car is convertible
		From Convertible-public-override: De naam van de car is convertible
		
		From Car-protected: De naam van de car is convertible
		From Convertible-protected: De naam van de car is convertible 
		 */

	}

}
