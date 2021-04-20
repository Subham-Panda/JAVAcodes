package FILEHANDLING.PROGRAMS;

import java.io.*;
public class filewriter1 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			FileWriter fout = new FileWriter(obj);
			// FileWriter fin = new FileWriter(new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt"));
			/*
				FileWriter(File)
				FileWriter(File, Charset)
				FileWriter(File, boolean appends)
				FileWriter(File, Charset, boolean append)
				FileWriter(String)
				FileWriter(String, Charset) -  eg:FileWriter("file.txt",Charset.forName("UTF8")) //! need to import java.nio.charset.Charset
				FileWriter(String, boolean append)
				FileWriter(String, Charset, boolean append)
			*/
			fout.write(104);
			fout.close();



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
