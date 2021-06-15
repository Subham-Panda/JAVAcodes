import java.util.Scanner;

public class qs7ArithmeticException {
	public static void main(String[] args) {
		try {
			int a, b;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first number: ");
			a = sc.nextInt();
			System.out.print("Enter second number: ");
			b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
			sc.close();
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide with 0. Please enter a number other than 0");
		}

	}
}
