package FILEHANDLING.PROGRAMS;

import java.io.*;

// FILE PATH - /home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt

public class fileinputstream3 {
	public static void main(String[] args) throws Throwable {

		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt");
			FileInputStream fin = new FileInputStream(obj);

			byte b2[] = new byte[5];
			fin.read(b2, 1, 2); // b2 in char = [null,'h','e',null,null]
			for (byte x : b2) {
				System.out.println((char) x);
			}
			System.out.println(fin.available());// 3

			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
