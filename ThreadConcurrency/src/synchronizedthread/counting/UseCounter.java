package synchronizedthread.counting;

public class UseCounter implements Runnable {

	private boolean isSynchronized;
	
	public UseCounter(boolean isSynchronized){
		this.isSynchronized=isSynchronized;
	}
	
	
	
	public void increment(){
		// increments the counter and prints the value
		// of the counter shared between threads
		Counter.count++;
		System.out.println(Counter.count + "\t" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private synchronized void incrementSynchronized() {
		// increments the counter and prints the value
				// of the counter shared between threads
		Counter.count++;
		System.out.println(Counter.count + "\t" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void incrementSynchronizedWithin(){
		synchronized(this){
			Counter.count++;
			System.out.println(Counter.count + "\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	@Override
	public void run() {
		for(int i=1;i<5;i++){
			if(!isSynchronized)
				increment();
			else
				incrementSynchronizedWithin();
			
		}
			
	}

}
