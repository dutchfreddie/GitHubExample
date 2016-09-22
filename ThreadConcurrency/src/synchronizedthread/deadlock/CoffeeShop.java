package synchronizedthread.deadlock;

public class CoffeeShop {

	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter1 = new Waiter();
		waiter1.setName("Waiter-1");
		//Waiter waiter2 = new Waiter();
		//Waiter waiter3 = new Waiter();
		//Waiter waiter4 = new Waiter();
		coffeeMachine.start();
		waiter1.start();
		//waiter2.start();
		//waiter3.start();
		//waiter4.start();

	}

}
