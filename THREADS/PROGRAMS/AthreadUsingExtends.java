package THREADS.PROGRAMS;

import java.io.*;

public class threadUsingExtends {
	public static void main(String[] args) {
		// processfile1 file1 = new processfile1();
		// processfile2 file2 = new processfile2();
		processfile1 file1 = new processfile1("thread1");
		processfile2 file2 = new processfile2("thread2");
		file1.start();
		file2.start();
		System.out.println(file1.getName());
		System.out.println(file2.getName());
	}
}

class processfile1 extends Thread {

	public processfile1(String s) {
		super(s);
	}

	@Override
	public void run() {

		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/THREADS/FILES/test1.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			for (int i = 1; i < 100; i++) {
				System.out.println("FILE 1 write");
				fout.write(i);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

class processfile2 extends Thread {
	public processfile2(String s) {
		super(s);
	}

	@Override
	public void run() {
		
		try{
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/THREADS/FILES/test2.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			for (int i = 100; i < 200; i++) {
				System.out.println("FILE 2 write");
				fout.write(i);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
