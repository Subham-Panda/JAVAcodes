public class qs9 {
	public static void main(String[] args) throws InterruptedException {
		account satish = new account();
		account ramesh = new account();
		Thread trans1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					satish.withdraw(10);
				}
			}
		});
		Thread trans2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 500; i++) {
					ramesh.withdraw(10);
				}
			}
		});
		trans1.start();
		trans2.start();
		trans1.join();
		trans2.join();
		satish.getbalance();
	}
}

class account {
	private int balance;

	public account() {
		this.balance = 20000;
	}

	public synchronized void withdraw(int withdraw_amount) {
		this.balance = this.balance - withdraw_amount;
	}

	public void getbalance() {
		System.out.println(this.balance);
	}
}