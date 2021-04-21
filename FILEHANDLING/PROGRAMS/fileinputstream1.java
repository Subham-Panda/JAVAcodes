import java.io.*;

// FILE PATH - /home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt

public class fileinputstream1 {
	public static void main(String[] args) throws Throwable {

		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt");
			FileInputStream fin = new FileInputStream(obj);

			// FileInputStream fin = new FileInputStream(new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt"));

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
