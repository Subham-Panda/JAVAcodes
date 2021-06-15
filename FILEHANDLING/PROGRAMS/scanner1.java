import java.util.*;
import java.io.*;

public class scanner1 {
	public static void main(String[] args) throws Throwable {
		// READ A SINGLE WORD
		try {
			File obj = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test6.txt");
			Scanner sc = new Scanner(obj);
			String word = sc.next();
			System.out.println(word); // this
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
