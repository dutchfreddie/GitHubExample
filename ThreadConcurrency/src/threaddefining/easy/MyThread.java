package threaddefining.easy;

public class MyThread extends Thread {

	private String string;
	
	public MyThread(String string) {
		super(string);
	}

	@Override
	public void run(){
		System.out.println("from out mt: " + this.isAlive());
		System.out.println("More Text");
		
	}
}
