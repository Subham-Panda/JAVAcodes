import java.util.Scanner;

public class qs1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			if(n > 10) {
				throw new satishexception("This is a userdefined exception");
			}
		} catch (satishexception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}

class satishexception extends Exception {
	public satishexception(String message) {
		super(message);
	}
}
