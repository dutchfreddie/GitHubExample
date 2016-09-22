package concurrency.semaphore;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ATMRoom {

	public static void main(String[] args) {
		
		// assume that only two ATM machines are available in the ATM room
		Semaphore machines = new Semaphore(5);
		// list of people waiting to access the machine
		new Person(machines, "Mickey");
		new Person(machines, "Donald");
		new Person(machines, "Tom");
		new Person(machines, "Jerry");
		new Person(machines, "Casper");
	}
}

class Person extends Thread {
	private Semaphore machines;
	public Person(Semaphore machines, String name) {
		this.machines = machines;
		this.setName(name);
		this.start();
	}
	
	public void run() {
		Random rd = new Random();
		int low = 3000; int high = 6000;
		int time = rd.nextInt(high-low) +low; 
		try {
			System.out.println(getName() + " waiting to access an ATM machine");
			machines.acquire();
			System.out.println(getName() + " is accessing an ATM machine");
			Thread.sleep(time); // simulate the time required for withdrawing amount
			System.out.println(getName() + " is done using the ATM machine");
			machines.release();
		}
		catch(InterruptedException ie) {
			System.err.println(ie);
		}
	}
}
