package FILEHANDLING.PROGRAMS;

import java.io.*;

public class bufferedoutputstream {
	public static void main(String[] args) throws Throwable {
		try {

			//BufferedOutputStream bout = new BufferedOutputStream(OutputStream);
			// BufferedOutputStream bout = new BufferedOutputStream(OutputStream, int size); - size - buffer size, if nothing mentioned default is taken

			BufferedInputStream bufin = new BufferedInputStream(System.in);
			int data = bufin.read();
			bufin.close();
			BufferedOutputStream bufout = new BufferedOutputStream(System.out); // system.out hence it prints to console
			bufout.write(data);
			bufout.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
