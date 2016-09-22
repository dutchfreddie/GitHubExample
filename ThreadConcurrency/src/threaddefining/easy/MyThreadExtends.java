package threaddefining.easy;

public class MyThreadExtends extends Thread {

	Thread t;
	String threadName;
	int x;
	
	public MyThreadExtends(String threadName) {
		x=0;
		t = new Thread(this,threadName);
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("Start MyThreadExtends");
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
		while(x<10);
		System.out.println("Terminate MyThreadExtends");
	}
	
	
}
