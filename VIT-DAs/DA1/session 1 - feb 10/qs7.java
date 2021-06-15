import java.util.*;

public class qs7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, continueAdding = 1;
		int sum = 0;
		while (continueAdding == 1) {
			System.out.print("Enter first number: ");
			a = sc.nextInt();
			System.out.print("Enter second number: ");
			b = sc.nextInt();
			sum += a + b;
			System.out.println("Do you want to continue ?y=1/=0");
			continueAdding = sc.nextInt();
		}
		System.out.println("Sum is: " + sum);
		sc.close();
	}
}
