import java.util.InputMismatchException;
import java.util.Scanner;

public class qs7InputMismatchException {
	public static void main(String[] args) {
		try {
			int a;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			a = sc.nextInt();
			System.out.println(a);
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("You need to enter a number. Not any other type");
		}
	}
}
