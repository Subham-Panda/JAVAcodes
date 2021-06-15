import java.util.Scanner;

public class qs6ArithmeticException {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		int c = a / b;
		System.out.println(c);
		sc.close();
	}
}
