import java.io.*;

public class bufferedreader3 {
	public static void main(String[] args) throws Throwable {
		try{
			BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in));
			char c[] = new char[10];
			bufread.read(c, 2, 7);// let input = "hello world"
			for (char x : c)
				System.out.println(x); //hello w, because the char array is ['','','h','e','l','l','o',' ','w','']
			bufread.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
