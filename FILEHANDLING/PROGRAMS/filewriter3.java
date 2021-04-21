import java.io.*;

public class filewriter3 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			FileWriter fout = new FileWriter(obj);

			char b[] = { 'h','e','l','l','o' };
			fout.write(b,1,3);//ell
			fout.close();



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
