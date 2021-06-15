package THREADS.PROGRAMS;

public class JthreadStaticSynchronized2 {
	public static void main(String[] args) throws Throwable {

		// SYNCHRONIZED THREADS
		test2 t = new test2();
		Thread thr1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					test2.display();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thr2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					test2.display();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thr1.start();
		thr2.start();

		/*
		OUTPUT:
		I am static synchronized
		(9 seconds wait)
		I am static and synchronized
		(9 seconds wait)
		*/
	}
}

class test2 {
	public static synchronized void display() throws Throwable {
		System.out.println("I am static synchronized");
		Thread.currentThread().sleep(9000);
	}

	public synchronized void display1() throws Throwable { 
		System.out.println("I am not static and synchronized");
	}
}
