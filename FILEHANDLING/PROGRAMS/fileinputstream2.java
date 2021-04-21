import java.io.*;

// FILE PATH - /home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt

public class fileinputstream2 {
	public static void main(String[] args) throws Throwable {

		// FileInputStream fin = new FileInputStream("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt")

		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test1.txt");
			FileInputStream fin = new FileInputStream(obj);

			byte b1[] = new byte[4];
			fin.read(b1);
			for (byte x : b1) {
				System.out.println((char) x);
			} // output: hell

			System.out.println(fin.available());// 1

			byte b2[] = new byte[5];
			fin.read(b2, 1, 2); // b2 in char = [null,'o',null,null,null]
			for (byte x : b2) {
				System.out.println((char) x);
			}

			System.out.println(fin.available());// 0

			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
