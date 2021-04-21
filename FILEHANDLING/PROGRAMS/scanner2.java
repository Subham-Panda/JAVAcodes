import java.util.*;
import java.io.*;

public class scanner2 {
	public static void main(String[] args) throws Throwable {
		// READ A FILE LINE BY LINE
		try {
			File obj = new File("/home/subham/Desktop/JAVACAT2PRACTICE/FILEHANDLING/FILES/test6.txt");
			Scanner sc = new Scanner(obj);
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();

			/*
			OUTPUT:
			this is line 1
			this is line 2
			this is line 3
			*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
