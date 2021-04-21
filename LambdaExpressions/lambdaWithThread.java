package LambdaExpressions;

public class lambdaWithThread {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("I am from thread1");
		};
		Thread thr = new Thread(r);
		thr.start();
	}
}
