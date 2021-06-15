import java.util.*;
import java.io.*;

public class qs12 {
	public static void main(String[] args) throws Throwable {
		try {
			File f = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/sample.txt");
			while (true) {
				System.out.println("1.Write UTF-16 characters to a file.");
				System.out.println("2.Read UTF-16 chracters from file.");
				System.out.println("3.Exit menu");
				Scanner sc1 = new Scanner(System.in);
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter choice: ");
				int n = sc.nextInt();
				if (n == 1) {
					OutputStreamWriter owrite = new OutputStreamWriter(new FileOutputStream(f), "UTF16");
					System.out.print("Enter string to write: ");
					String s = sc1.nextLine();
					owrite.write(s);
					owrite.close();
				} else if (n == 2) {
					InputStreamReader iread = new InputStreamReader(new FileInputStream(f), "UTF16");
					char c[] = new char[100];
					iread.read(c);
					for (char x : c) {
						System.out.print(x);
					}
					System.out.println();
					iread.close();
				} else if (n == 3) {
					sc.close();
					sc1.close();
					System.exit(1);
				} else {
					System.out.println("INVALID CHOICE");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}