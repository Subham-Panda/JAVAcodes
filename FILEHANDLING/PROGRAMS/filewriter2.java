import java.io.*;
public class filewriter2 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			FileWriter fout = new FileWriter(obj);
			char b[] = { 'h','e','l' };
			fout.write(b); // replaces
			fout.append("random"); // appends - works even without append true in constructor of FileWriter
			fout.close();

			// File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			// FileWriter fout = new FileWriter(obj,true);
			// char b[] = { 'h','e','l' };
			// fout.write(b); // !even this appends
			// fout.append("random"); // appends - works even without append true in constructor of FileWriter





		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

