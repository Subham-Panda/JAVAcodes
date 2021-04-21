public class FthreadUnsynchronized {
	public static void main(String[] args) throws Throwable {

		// UNSYNCHRONIZED THREADS
		account s = new account(20000);
		Thread thr1 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					s.withdraw(100);
				}
			}
		});
		Thread thr2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<50;i++) {
					s.withdraw(100);
				}
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println(s.balance);
	}
}

class account {
	public int balance;

	public account(int deposit) {
		this.balance = deposit;
	}

	public void withdraw(int withdraw_amount) {
		this.balance = this.balance - withdraw_amount;
	}
}
