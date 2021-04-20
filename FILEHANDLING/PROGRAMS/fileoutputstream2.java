package FILEHANDLING.PROGRAMS;

import java.io.*;

public class fileoutputstream2 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			byte b[] = { 104, 105, 106 };
			fout.write(b);
			fout.close();



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
