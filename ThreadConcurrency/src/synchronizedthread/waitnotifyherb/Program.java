package synchronizedthread.waitnotifyherb;

public class Program {

	public static void main(String[] args) {
		System.out.println("Start Main Thread");
		SyncOb sObJ = new SyncOb();
		MyThread mt = new MyThread("My custom thread-1",sObJ);
		//MyThread mt2 = new MyThread("My custom thread-2",sObJ);
		for(int i = 0;i<10;i++){
			try {
				Thread.sleep(500);
				System.out.print(".");
				if(i==9)
					System.out.print("\n");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		sObJ.goAhead();
		System.out.println("Terminate main thread");
	}

}
