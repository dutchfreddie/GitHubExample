package threaddefining.join;

import java.lang.Thread.State;

public class TimeBombRunnable implements Runnable {

	String [] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine" };
	
	
	@Override
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
	
	public static void main(String[] args){
		
		Thread myThread = new Thread(new TimeBombRunnable());
		State state = myThread.getState();
		System.out.println(myThread.getState());
		myThread.start();		
		System.out.println(myThread.getState());	
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(myThread.getState());
		System.out.println("Bomb explodes!!!!!!!!!!!!!!");
	}
}
