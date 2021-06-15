import java.io.*;
import java.util.Scanner;

public class qs4 {
	public static void main(String[] args) throws InterruptedException {
		fileOperation fo = new fileOperation();
		Thread thr_read1 = new Thread((Runnable)() -> {
			try {
				fo.readAndAdd();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
		Thread thr_read2 = new Thread((Runnable)() -> {
			try {
				fo.readAndMultiply();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
		Thread thr_write = new Thread((Runnable)() -> {
			try {
				fo.writeToFile();
			} catch (Throwable e) {
				e.printStackTrace();
			}
		});
		thr_read1.start();
		thr_read2.start();
		thr_write.start();
		thr_read1.join();
		thr_read2.join();
		thr_write.join();
	}
}

class fileOperation {
	private boolean fileBusy = false;

	public synchronized void writeToFile() throws Throwable {
		fileBusy = true;
		Scanner sc = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("input.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		dout.writeInt(num1);
		dout.writeInt(num2);
		System.out.println("THE TWO NUMBERS HAVE BEEN WRITTEN TO FILE input.txt");
		dout.close();
		sc.close();
		fileBusy = false;
		notifyAll();
	}

	public synchronized void readAndAdd() throws Throwable {
		FileInputStream fin = new FileInputStream("input.txt");
		DataInputStream din = new DataInputStream(fin);
		while (fileBusy || din.available()==0) {
			System.out.println("THREAD READ 1 IS WAITING");
			wait();
		}
		int num1 = din.readInt();
		int num2 = din.readInt();
		System.out.println("Sum: " + (num1 + num2));
		din.close();
	}

	public synchronized void readAndMultiply() throws Throwable {
		FileInputStream fin = new FileInputStream("input.txt");
		DataInputStream din = new DataInputStream(fin);
		while (fileBusy || din.available()==0) {
			System.out.println("THREAD READ 2 IS WAITING");
			wait();
		}
		int num1 = din.readInt();
		int num2 = din.readInt();
		System.out.println("Sum: " + (num1 * num2));
		din.close();
	}
}