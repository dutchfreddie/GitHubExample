package threaddefining.easy;

public class MyThreadRunnable implements Runnable {

	Thread t;
	String threadName;
	int x;
	
	public MyThreadRunnable(String threadName) {
		x=0;
		t = new Thread(this,threadName);
		t.start();
	}
	
	@Override
	public void run() {
		do{
			try {
				Thread.sleep(250);
				System.out.println("Count: " + x + ";Name: " + t.getName() + ";ID: " + t.getId());
				x++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		while(x<20);
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

}
