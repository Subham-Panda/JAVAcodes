import java.util.*;

public class qs1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side: ");
		int x = sc.nextInt();
		System.out.println("Area is: " + String.valueOf(x * x * 0.25 * Math.sqrt(3.0)));
		sc.close();
	}
}
