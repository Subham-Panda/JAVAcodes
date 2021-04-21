public class GthreadSynchronized {
	public static void main(String[] args) throws Throwable {

		// SYNCHRONIZED THREADS
		bankAccount s = new bankAccount(20000);
		Thread thr1 = new Thread(new Runnable(){
			@Override
			public void run() {
				s.withdraw(10000);
			}
		});
		Thread thr2 = new Thread(new Runnable(){
			@Override
			public void run() {
				s.deposit(5000);
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
		System.out.println(s.balance);

		/*
		OUTPUT:
		This is Withdrawl
		This is Deposit
		15000
		*/
	}
}

class bankAccount {
	public int balance;

	public bankAccount(int deposit) {
		this.balance = deposit;
	}

	public synchronized void withdraw(int withdraw_amount) {
		System.out.println("This is Withdrawl");
		this.balance = this.balance - withdraw_amount;
	}

	public synchronized void deposit(int deposit_amount) {
		System.out.println("This is Deposit");
		this.balance = this.balance + deposit_amount;
	}
}
