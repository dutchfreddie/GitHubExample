package synchronizedthread.waitnotify;

public class ThreadA {

	public static void main(String [] args) {
		
		ThreadB b2 = new ThreadB();
		b2.setName("b2");
		//ThreadB b = new ThreadB();
		//b.setName("b");
		b2.start();
		//b.start();
		
		/*
		synchronized(b) {
			System.out.println("Waiting for b to complete..." + b.getName());
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in: " + b.getName());
				e.printStackTrace();
			}
			System.out.println("Total is in inside synchronized: " + b.getName() + " " + b.total);
		}
		
		synchronized(b2) {
			System.out.println("Waiting for b2 to complete..." + b2.getName());
			try {
				b2.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Error in: " + b2.getName());
				e.printStackTrace();
			}
			System.out.println("Total is in inside synchronized: " + b2.getName() + " " + b2.total);
		}
		*/
		
		
		
	}

}
