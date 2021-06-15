import java.io.*;

public class qs4 {
	public static void main(String[] args) throws Throwable {
		Thread thread1 = new Thread((Runnable) () -> {
			try {
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/File1.txt");
				FileOutputStream fout = new FileOutputStream(obj);
				DataOutputStream dout = new DataOutputStream(fout);
				for (int i = 2; i <= 100; i++) {
					boolean isPrime = true;
					for (int j = 2; j <= i / 2; j++) {
						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime) {
						dout.writeInt(i);
						Thread.sleep(2000);
					}
				}
				dout.close();
				fout.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		});

		Thread thread2 = new Thread((Runnable) () -> {
			try {
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/File2.txt");
				FileOutputStream fout = new FileOutputStream(obj);
				DataOutputStream dout = new DataOutputStream(fout);
				for (int i = 101; i <= 200; i++) {
					boolean isPrime = true;
					for (int j = 2; j <= i / 2; j++) {
						if (i % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime) {
						dout.writeInt(i);
						Thread.sleep(2000);
					}
				}
				dout.close();
				fout.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		Thread thread3 = new Thread((Runnable) () -> {
			try {
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/File1.txt");
				FileInputStream fin = new FileInputStream(obj);
				DataInputStream din = new DataInputStream(fin);
				while (din.available() > 0) {
					System.out.println("Printing from File1.txt - " + din.readInt());
				}
				din.close();
				fin.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		Thread thread4 = new Thread((Runnable) () -> {
			try {
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/File2.txt");
				FileInputStream fin = new FileInputStream(obj);
				DataInputStream din = new DataInputStream(fin);
				while (din.available() > 0) {
					System.out.println("Printing from File2.txt - " + din.readInt());
				}
				din.close();
				fin.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		});

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		thread3.start();
		thread4.start();

	}
}
