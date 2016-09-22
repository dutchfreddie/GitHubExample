package defaultpackage;

public class Car {

	protected String nameCar;
	protected final int x = 9;
	
	public Car(){
		
	}
	public Car(String nameCar){
		this.nameCar=nameCar;
	}
	
	public void returnPublicCar(){
		System.out.println("From Car-public: De naam van de car is " + nameCar);
	}
	
	protected void returnProtectedCar(){
		System.out.println("From Car-protected: De naam van de car is " + nameCar);
	}
	
	
	
	protected String returnString(){
		
		return nameCar;
	}
	
	public static void staticMethod(){
		
	}
}
