import java.util.*;
import java.io.*;

public class qs10 {
	public static void main(String[] args) throws Throwable {
		try {
			Thread thread1 = new Thread((Runnable) () -> {
				Scanner sc;
				try {
					sc = new Scanner(new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/sample1.txt"));
					int arr[] = { 0, 0, 0 };
					while (sc.hasNext()) {
						String word = sc.next();
						if (word.compareTo("a") == 0) {
							arr[0]++;
						} else if (word.compareTo("and") == 0) {
							arr[1]++;
						} else if (word.compareTo("the") == 0) {
							arr[2]++;
						}
					}
					System.out.println("a occures " + arr[0] + " times");
					System.out.println("and occures " + arr[1] + " times");
					System.out.println("the occures " + arr[2] + " times");
					sc.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			Thread thread2 = new Thread((Runnable) () -> {
				Scanner sc;
				try {
					sc = new Scanner(new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/sample2.txt"));
					int c = 0;
					while (sc.hasNext()) {
						String word = sc.next();
						if (word.compareTo("a") != 0 && word.compareTo("and") != 0 && word.compareTo("the") != 0
								&& word.startsWith("S")) {
							c++;
						}
					}
					System.out.println("the number of times word starting with S occurs is " + c);
					sc.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			});
			Thread thread3 = new Thread((Runnable) () -> {
				System.out.println("Thanks for using our software");
			});
			thread1.start();
			thread1.setPriority(2);
			thread2.start();
			thread2.setPriority(2);
			thread1.join();
			thread2.join();
			thread3.start();
			thread3.setPriority(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}