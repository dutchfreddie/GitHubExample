package threaddefining.join;

import java.lang.Thread.State;

class TimeBomb extends Thread {
	String [] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine" };
	
	public void run() {
		for(int i = 9; i >= 0; i--) {
			try {
				System.out.println(timeStr[i]);
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	public static void main(String []s) {
		TimeBomb timer = new TimeBomb();
		System.out.println("Starting 10 second count down. . . ");
		State state = timer.getState();
		System.out.println(timer.getState());
		timer.start();
		System.out.println(timer.getState());
		try {
			timer.join();
			System.out.println(timer.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Boom!!!");
	}
}
