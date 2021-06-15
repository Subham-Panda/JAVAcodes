import java.io.*;

// FILE PATH - /home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test1.txt

public class file1 {
	public static void main(String[] args) {

		// File obj = new
		// File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test1.txt");

		// File obj = new
		// File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES","test1.txt");

		File parent = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES");
		File obj = new File(parent, "test1.txt");

		System.out.println(".seperator: " + obj.separator);
		System.out.println("getName(): " + obj.getName());
		System.out.println("getParent(): " + obj.getParent());
		System.out.println("getPath(): " + obj.getPath());
		System.out.println("isAbsolute(): " + obj.isAbsolute());
		System.out.println("getAbsolutePath(): " + obj.getAbsolutePath());
		System.out.println("canRead(): " + obj.canRead());
		System.out.println("canWrite(): " + obj.canWrite());
		System.out.println("exists(): " + obj.exists());
		System.out.println("isDirectory(): " + obj.isDirectory());
		System.out.println("isFile(): " + obj.isFile());
		System.out.println("length(): " + obj.length());

		String[] s = parent.list();
		File[] f = parent.listFiles();
		System.out.println("\n\n");
		for (String a : s) {
			System.out.println(a);
		}
		System.out.println("\n\n");
		for (File a : f) {
			System.out.println(a.getName());
		}
	}
}
