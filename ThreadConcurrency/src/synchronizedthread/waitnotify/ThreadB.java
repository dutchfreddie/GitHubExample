package synchronizedthread.waitnotify;

public class ThreadB extends Thread {

	public int total;
	
	public void run() {
		counting();
		//moreCounting();
	}
	
	private synchronized void counting(){
		for(int i=0;i<100;i++) {
			total += i;
			System.out.println(getName() + " is " + total);
			if(i==10){
				ThreadC c = new ThreadC();
				c.setName("c");
				c.start();
				try {
					sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
				
		}
	}
	
	private void moreCounting(){
		synchronized(this) {
			for(int i=0;i<100;i++) {
				total += i;
				System.out.println(getName() + " is " + total);
				
			}
			notify();
		}
	}
}
