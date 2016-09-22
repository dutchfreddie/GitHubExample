package synchronizedthread.waitnotifyherb;

public class SyncOb {


	boolean ready = false;
	
	public synchronized void  waitFor(){
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " is entering waitFor().");
		try {
			while(!ready)
				this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thrdName + " received notification");
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
		System.out.println("Terminate thread: " + thrdName);
	}
	
	public synchronized void goAhead(){
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " is entering goAhead().");
		ready = true;
		this.notify();
		
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
		
		
	}
	

}
