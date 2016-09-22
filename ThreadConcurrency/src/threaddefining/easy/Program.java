package threaddefining.easy;

public class Program {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		MyThreadRunnable mtr = new MyThreadRunnable("MyOwnThread");
		//MyThreadExtends mte = new MyThreadExtends("My Own Thread Extends");
		//Thread tj = new Thread(new MyThreadJoin());
		//tj.start();
		
		int x = 0;
		System.out.println("Start Main Thread");
		//do{
			//mte.join();
			mtr.getT().join(0);
			//Thread.sleep(4000);		
			
			System.out.println("Count Main: " + x + "; " + Thread.currentThread().getId()
					+ "; " + Thread.currentThread().getName());
			
			x++;
			
		//}
		//while(x<5);
		
		System.out.println("Terminate Main Thread");
	}
	
	static void runnableThreadExample() throws InterruptedException{
		Runnable r = new MyRunnable();
		Thread t2 = new Thread();
		Thread t = new Thread(r);
		int x = 0;
		t.start();
		t2.start();
		do{
			Thread.sleep(2000);
			
			System.out.println("Hello");
			System.out.println(Thread.currentThread().getId());
			System.out.println(t.getId());
			System.out.println(t2.getId());
			x++;
		}
		while(x<5);
	}
	
	static void yieldRunnableExample(){
	
		YieldRunnable yr = new YieldRunnable();
		Thread t1 = new Thread(yr,"A");
		Thread t2 = new Thread(yr,"B");
		t1.start();
		
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void sleepExample(){
		MyRunnable2 m1 =new MyRunnable2(100);
		MyRunnable2 m2 =new MyRunnable2(200);
		MyRunnable2 m3 =new MyRunnable2(300);
		Thread one = new Thread(m1);
		Thread two = new Thread(m2);
		Thread three = new Thread(m3);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.setPriority(1);
		three.setPriority(10);
		
		two.start();
		three.start();
		one.start();
	}
	
	
	static void firstThreadExample(){
		Thread m = Thread.currentThread();
		System.out.println(m.getName() + " " + m.isAlive() + " " + m.getId() + " " +m.getPriority());
		MyThread mt = new MyThread("Frederik");
		mt.start();
		System.out.println("from main, mt: " + mt.getName() + " "+ mt.isAlive() + " " + mt.getId() + " " +mt.getPriority());
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		System.out.println("from main, t "+ t.getName() + " "  + t.isAlive() + " " + t.getId() + " " +t.getPriority());

		//t.stop();
		//t.interrupt();
		t.start();
	}

}
