public class HthreadSynchronizedWithSleep {
	public static void main(String[] args) throws Throwable {

		// SYNCHRONIZED THREADS
		bankAccount1 s = new bankAccount1(20000);
		Thread thr1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					s.withdraw(10000);
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					s.deposit(5000);
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println(s.balance);

		/*
		 OUTPUT: This is Withdrawl (waits 9 seconds) 
		 This is Deposit (waits 9 seconds)
		 15000
		 */
	}
}

class bankAccount1 {
	public int balance;

	public bankAccount1(int deposit) {
		this.balance = deposit;
	}

	// public void withdraw(int withdraw_amount) throws Throwable {
	// 	synchronized (this) {
	// 		System.out.println("This is Withdrawl");
	// 		Thread.currentThread().sleep(9000);
	// 		this.balance = this.balance - withdraw_amount;
	// 	}
	// 	System.out.println("OUT OF SYNCHRONIZED BLOCK");
	// }

	public synchronized void withdraw(int withdraw_amount) throws Throwable {
		System.out.println("This is Withdrawl");
		Thread.currentThread().sleep(9000);
		this.balance = this.balance - withdraw_amount;
	}

	public synchronized void deposit(int deposit_amount) throws Throwable {
		System.out.println("This is Deposit");
		Thread.currentThread().sleep(9000);
		this.balance = this.balance + deposit_amount;
	}
}
