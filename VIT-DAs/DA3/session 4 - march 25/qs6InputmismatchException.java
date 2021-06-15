import java.util.Scanner;

public class qs6InputmismatchException {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
