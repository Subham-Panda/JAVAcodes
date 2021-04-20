package FILEHANDLING.PROGRAMS;

import java.io.*;

public class filereader1 {
	public static void main(String[] args) throws Throwable {

		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt");
			FileReader fin = new FileReader(obj);

			// FileReader fin = new FileReader(new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt"));
			/*
				FileReader(File)
				FileReader(File, Charset)
				FileReader(String)
				FileReader(String, Charset) -  eg:FileReader("file.txt",Charset.forName("UTF8")) //! need to import java.nio.charset.Charset
			*/

			// int data = fin.read();
			// System.out.println((char) data); //h
			// System.out.println((char) fin.read()); //e
			// System.out.println((char) fin.read()); //l
			// System.out.println((char) fin.read()); //l
			// System.out.println((char) fin.read()); //o
			// System.out.println(fin.read()); // -1

			int data;
			while ((data = fin.read()) != -1) {
				System.out.println((char) data);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
