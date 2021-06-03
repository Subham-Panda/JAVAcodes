package THREADS.PROGRAMS;

public class BthreadUsingImplementsRunnable {
	public static void main(String[] args) {
		test t = new test();
		Thread thr = new Thread(t); // We can give second paraemter as thread name
		thr.start();
	}
}

class test implements Runnable {
	@Override
	public void run() {
		System.out.println(" I am from the thread");
	}
}
