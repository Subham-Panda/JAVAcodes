package FILEHANDLING.PROGRAMS;

import java.io.File;

public class file2 {
	public static void main(String[] args) throws Throwable {
		File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test2.txt");
		if (obj.createNewFile()) {
			System.out.println("FILE CREATED");
		}
	}
}
