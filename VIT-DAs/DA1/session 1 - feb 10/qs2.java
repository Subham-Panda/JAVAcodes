import java.util.*;

public class qs2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		int x = sc.nextInt();
		System.out.println("Radius is: " + String.valueOf(Math.PI * x * x));
		sc.close();
	}
}