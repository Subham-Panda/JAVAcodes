import java.io.*;

public class filereader3 {
	public static void main(String[] args) throws Throwable {

		try {
			File obj = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test1.txt");
			FileReader fin = new FileReader(obj);

			char c[] = new char[5];
			fin.read(c, 1, 2); // c in char = ['','h','e','','']
			for (char x : c) {
				System.out.println((char) x);
			}

			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
