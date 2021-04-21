import java.io.*;

public class bufferedreader2 {
	public static void main(String[] args) throws Throwable {
		try{
			BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
			char c[] = new char[100];
			bufread.read(c); // let input = "hello world"
			for (char x : c)
				System.out.print(x); //hello world
			bufread.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
