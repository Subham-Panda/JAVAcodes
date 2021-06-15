import java.io.*;

public class fileoutputstream3 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test3.txt");
			FileOutputStream fout = new FileOutputStream(obj);

			byte b[] = { 104, 105, 106, 107, 108 };
			fout.write(b, 1, 3);
			fout.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
