package FILEHANDLING.PROGRAMS;

import java.io.*;

public class bufferedinputstream {
	public static void main(String[] args) throws Throwable {
		try {
			BufferedInputStream bufin = new BufferedInputStream(System.in);// System.in hence it will take input from console

			//BufferedInputStream bufin = new BufferedInputStream(InputStream, int size); // size - buffer size, if nothing mentioned default is taken

			int data = bufin.read(); // let input = "hello", then data stores 104(ascii for h)
			System.out.println((char) data);
			bufin.mark(5);// mark is set here i.e 'e'
			byte b[] = new byte[4];
			bufin.read(b);
			bufin.reset(); // control is transffered to 'e', so it will agains tart reading from 'e'
			data = bufin.read();
			System.out.println((char)data);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
