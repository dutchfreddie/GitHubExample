package threaddefining.easy;

public class MyThreadJoin implements Runnable {

	int count;
	
	public MyThreadJoin(){
		count = 0;
	}
	
	@Override
	public void run() {
		System.out.println("MyThreadJoin Start");
		
		try {
			do{
				Thread.sleep(500);
				System.out.println(count);
				count++;
			}
			while(count<6);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("MyThreadJoin Terminated");

	}

}
