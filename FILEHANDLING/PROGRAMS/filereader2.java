import java.io.*;

public class filereader2 {
	public static void main(String[] args) throws Throwable {

		try {
			File obj = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test1.txt");
			FileReader fin = new FileReader(obj);

			char c1[] = new char[4];
			fin.read(c1);
			for (char x : c1) {
				System.out.println(x);
			} // output: hell

			char c2[] = new char[5];
			fin.read(c2, 1, 2); // c2 = {'','o','','',''}
			for (char x : c2) {
				System.out.println(x);
			}

			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
