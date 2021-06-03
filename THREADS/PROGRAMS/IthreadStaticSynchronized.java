package THREADS.PROGRAMS;

public class IthreadStaticSynchronized{
	public static void main(String[] args) throws Throwable {

		// SYNCHRONIZED THREADS
		test1 t = new test1();
		Thread thr1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					test1.display();
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
					t.display1();
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
		I am not static and synchronized
		(9 seconds wait)
		*/
	}
}

class test1 {
	public static synchronized void display() throws Throwable {
		System.out.println("I am static synchronized");
		Thread.currentThread().sleep(9000);
	}

	public static synchronized void display1() throws Throwable { 
		System.out.println("I am not static and synchronized");
	}
}
