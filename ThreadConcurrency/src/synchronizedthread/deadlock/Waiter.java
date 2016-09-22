package synchronizedthread.deadlock;

public class Waiter extends Thread {

	public void getCoffee() {
		synchronized(CoffeeMachine.lock) {
			if(CoffeeMachine.coffeeMade == null) {
				try {
					// wait till the CoffeeMachine says (notifies) that
					//coffee is ready
					System.out.println("Waiter: " + getName() +  
							" Will get orders till coffee machine notifies me ");
					CoffeeMachine.lock.wait();
				}
				catch(InterruptedException ie) {
					// its okay to ignore this exception
					// since we're not using thread interrupt mechanism
					ie.printStackTrace();
				}
			}
			if(CoffeeMachine.coffeeMade!=null)
				System.out.println("Waiter: " + getName() +  " Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null;
			// ask (notify) the coffee machine to prepare the next coffee
			CoffeeMachine.lock.notifyAll();
			System.out.println("Waiter: " + getName() +  " Notifying coffee machine to make another one");		}
	}
	
	public void run() {
		// keep going till the user presses ctrl-C and terminates the program
		while(true) {			
			try{
				getCoffee();
				System.out.println(getName() + " is delivering a coffee");
				sleep(5000);
			}
			catch(InterruptedException ie) {
				// its okay to ignore this exception
				// since we're not using thread interrupt mechanism
				ie.printStackTrace();
			}
			
		}
	}
}
