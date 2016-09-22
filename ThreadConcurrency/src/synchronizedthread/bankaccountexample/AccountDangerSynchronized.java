package synchronizedthread.bankaccountexample;

public class AccountDangerSynchronized implements Runnable {

private Account acct = new Account();
	
	@Override
	public  void run() {
		
		for (int x = 0; x < 5; x++) {
				makeWithdrawal(10);
			if (acct.getBalance() <= 0) {
				System.out.println("account is overdrawn!");
				break;
			}
		}		
	}
	
	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()
								+ " is going to withdraw and the amount on the bank is " + acct.getBalance() );
			try {
				Thread.sleep(1000);
			} 
			catch(InterruptedException ex) { }
				acct.withdraw(amt);
				System.out.println(Thread.currentThread().getName()
						+ " completes the withdrawal and the amount on the bank is " + acct.getBalance());
			} 
		
		else {
			System.out.println("Not enough in account for "
							+ Thread.currentThread().getName()
							+ " to withdraw " + acct.getBalance());
		}
	}
	
	private void returnCounting(int i){
		
			System.out.println(Thread.currentThread().getName() + " counts to " + i);
			
	}

}
