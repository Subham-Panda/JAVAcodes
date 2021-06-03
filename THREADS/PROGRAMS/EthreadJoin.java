package THREADS.PROGRAMS;

public class EthreadJoin {
	public static void main(String[] args) throws Throwable {
		Thread thr1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread1");
			}
		});

		Thread thr2 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread2");
			}
		});
		thr1.start();
		thr1.join();
		thr2.start();
		thr2.join();
		System.out.println("I am from the main thread");
		System.out.println(Thread.currentThread().getPriority()); 
		//MAIN THREAD AHS PRIORITY 5 BY DEFAULT
		//Default prority is 5 for a thread
	}
}
