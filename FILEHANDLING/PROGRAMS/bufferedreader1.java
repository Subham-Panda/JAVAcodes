import java.io.*;

public class bufferedreader1 {
	public static void main(String[] args) throws Throwable {
		try{
			BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in)); // can also give size as second arg to constructor
			int data = bufread.read(); // let input = "hello world"
			System.out.println(data);//104
			String s = bufread.readLine(); // s = reamining to be read i.e "ello world"
			System.out.println(s);
			bufread.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
