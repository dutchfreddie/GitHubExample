package synchronizedthread.bankaccountexample;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountDangerMixedSynchronized r = new AccountDangerMixedSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);		
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();		
			
	}
	
	static void unsynchronizedExample(){
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();	
	}
	
	static void synchronizedExample(){
		AccountDangerSynchronized r = new AccountDangerSynchronized();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();		
	}

}
