import java.util.*;

public class qs5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int sum = n * (n + 1) / 2;
		System.out.println("Sequence is: " + String.valueOf(sum));
		sc.close();
	}
}