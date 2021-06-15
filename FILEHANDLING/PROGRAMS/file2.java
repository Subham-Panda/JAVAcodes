import java.io.File;

public class file2 {
	public static void main(String[] args) throws Throwable {
		File obj = new File("/home/subham/Desktop/JAVAcodes/FILEHANDLING/FILES/test2.txt");
		// have to call createNewFile() for creating new file
		if (obj.createNewFile()) {
			System.out.println("FILE CREATED");
		}
	}
}
