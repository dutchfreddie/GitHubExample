package synchronizedthread.waitnotifyherb;

public class MyThread implements Runnable {

	private SyncOb so;
	private String name;
	
	public MyThread(String name, SyncOb so){
		this.setName(name);
		this.so=so;
		new Thread(this,name).start();
	}
	
	@Override
	public void run() {
		System.out.println("Running run() from " + this.getName());
		so.waitFor();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
