import java.io.*;

public class fileoutputstream1 {
	public static void main(String[] args) throws Throwable {
		try {

			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			FileOutputStream fout = new FileOutputStream(obj); // ! If file is not available then new file may be created or not depending on underlying system

			//FileOutputStream fout = new FileOutputStream("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt");
			//FileOutputStream fout = new FileOutputStream(new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test3.txt"));

			/*
			FileOutputStream constructor second argument as a boolean which is false by default, making it true makes the outputstream as append mode
			FileOutputStream fout = new FileOutputStream(obj,true);
			*/

			fout.write(104);
			fout.close();



		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
