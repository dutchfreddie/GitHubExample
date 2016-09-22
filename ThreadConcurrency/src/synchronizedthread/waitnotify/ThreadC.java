package synchronizedthread.waitnotify;

public class ThreadC extends Thread {

	private int total;
	
	public void run() {
		counting();
		//moreCounting();
	}
	
	private synchronized void counting(){
		for(int i=0;i<100;i++) {
			total += i;
			System.out.println(getName() + " is " + total);
		}
	}
}
