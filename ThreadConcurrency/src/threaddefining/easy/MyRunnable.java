package threaddefining.easy;

public class MyRunnable implements Runnable {

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from out, t " + Thread.currentThread().isAlive() + " " + Thread.currentThread().getId());

	}

}
