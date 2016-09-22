package threaddefining.easy;

public class MyRunnable2 implements Runnable {

	private int sleepTime;
	
	public MyRunnable2(int sleepTime){
		this.sleepTime=sleepTime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int x = 1; x <= 3; x++) {			
			System.out.println("Run by "
					+ Thread.currentThread().getName()
					+ ", x is " + x);
			//Thread.sleep(sleepTime);
			Thread.yield();
						
			}
		
		
		

	}

	

}
