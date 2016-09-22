package threaddefining.easy;

public class YieldRunnable implements Runnable {

	
	@Override
	public void run() {
		for (int x = 1; x <= 3; x++) {			
			System.out.println("Run by "
					+ Thread.currentThread().getName()
					+ ", x is " + x);
						
			}
	}

	

}
