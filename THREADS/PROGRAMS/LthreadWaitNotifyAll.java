package THREADS.PROGRAMS;

public class LthreadWaitNotifyAll {
	public static void main(String[] args) throws Throwable {
		BankAccount subham = new BankAccount(2000);
		Thread thr1=new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					subham.withdraw(30000);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr2=new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					subham.withdraw(40000);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr3=new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					subham.deposit(40000);
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thr1.start();
		thr2.start();
		thr3.start();
		thr1.join();
		thr2.join();
		thr3.join();
		System.out.println(subham.balance);

		/*
		OUPUT:
		This is Withdrawl Thread 13
		Withdrawal Thread 13 is waiting

		This is Deposit Thread 15
		Depsoit Thread 15 is depositing
		NOTIFYING

		WITHDRAWAL HAPPENING by Thread 13


		This is Withdrawl Thread 14
		Withdrawal Thread 14 is waiting
		*/
	}
}

class BankAccount {
	int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(int withdraw_amount) throws Throwable {
		System.out.println();
		System.out.println("This is Withdrawl Thread " + Thread.currentThread().getId());
		while (withdraw_amount > balance) {
			System.out.println("Withdrawal Thread " + Thread.currentThread().getId() + " is waiting");
			wait();
		}
		System.out.println("WITHDRAWAL HAPPENING by Thread "+ Thread.currentThread().getId());
		System.out.println();
		this.balance = this.balance - withdraw_amount;
	}
	
	public synchronized void deposit(int deposit_amount) throws Throwable {
		System.out.println();
		System.out.println("This is Deposit Thread "+Thread.currentThread().getId());
		System.out.println("Depsoit Thread " + Thread.currentThread().getId() + " is depositing");
		System.out.println("NOTIFYING");
		System.out.println();
		this.balance = this.balance + deposit_amount;
		notifyAll();
	}
}
