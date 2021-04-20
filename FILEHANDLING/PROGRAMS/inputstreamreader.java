package FILEHANDLING.PROGRAMS;

import java.io.*;

public class inputstreamreader {
	public static void main(String[] args) throws Throwable {
		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test4.txt");
			FileInputStream fin = new FileInputStream(obj);
			InputStreamReader iread = new InputStreamReader(fin, "UTF16");
			// InputStreamReader iread = new InputStreamReader(fin,Charset.forName("UTF16"));
			int data = iread.read();
			// iread.read(char[] c)
			// iread.read(char[] c, int offset, int length)
			System.out.println((char) data);
			iread.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
