package THREADS.PROGRAMS;
public class threadWithAnonymousRunnableClass {
	public static void main(String[] args) {
		Thread thr1 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread1");
			}
		});
		thr1.start();

		Thread thr2 = new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("I am from the thread2");
			}
		});
		thr2.start();

		System.out.println("I am from the main thread");
	}
}
