package FILEHANDLING.PROGRAMS;

import java.io.*;

public class bufferedwriter {
	public static void main(String[] args) throws Throwable {
		try {
			BufferedWriter bufwrite = new BufferedWriter(new OutputStreamWriter(System.out));
			bufwrite.write(104);
			bufwrite.newLine();
			char c[] = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
			String s="milkyway galaxy";
			bufwrite.write(c);
			bufwrite.newLine();
			bufwrite.write(c, 2, 5);
			bufwrite.newLine();
			bufwrite.write(s);
			bufwrite.newLine();
			bufwrite.write(s, 2, 7);
			bufwrite.newLine();
			bufwrite.close();

			/*
			!OUTPUT:
			h
			hello world
			llo w
			milkyway galaxy
			lkyway
			
			!OUTPUT (without newLine()):
			hhello worldllo wmilkyway galaxylkyway
			*/
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
