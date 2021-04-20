package FILEHANDLING.PROGRAMS;

import java.io.*;

public class outputstreamwriter {
	public static void main(String[] args) throws Throwable {
		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test4.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			OutputStreamWriter iwrite = new OutputStreamWriter(fout, "UTF16");
			// OutputStreamWriter iwrite = new OutputStreamWriter(fin,Charset.forName("UTF16"));
			iwrite.write(1013);
			//iwrite.write(String s)
			//iwrite.write(String s, int offset, int length)
			// iwrite.write(char[] c)
			// iwrite.write(char[] c, int offset, int length)
			iwrite.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
