package THREADS.PROGRAMS;

public class DthreadPriority {
	public static void main(String[] args) {
		Thread thr1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread1");
			}
		});
		thr1.start();
		thr1.setPriority(10); //MAX CAN BE 10
		thr1.getPriority();

		Thread thr2 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread2");
			}
		});
		thr2.start();
		thr2.setPriority(1); //MIN CAN BE 1
		thr2.getPriority();


		System.out.println("I am from the main thread");
		System.out.println(Thread.currentThread().getPriority()); 
		//MAIN THREAD AHS PRIORITY 5 BY DEFAULT
		//Default prority is 5 for a thread
	}
}
