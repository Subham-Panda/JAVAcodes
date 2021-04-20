package EXCEPTIONS.PROGRAMS;

import java.util.*;

public class exception8 {
	public static void main(String[] args) {

		try {
			dividebyzero d = new dividebyzero();
			d.dividenumbers();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Enter correct input");
		}
	}
}

class dividebyzero {
	private int a;
	private int b;

	public dividebyzero() throws InputMismatchException { // ! Constructor can also throw excpetion
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
	}

	public void dividenumbers() throws ArithmeticException {
		System.out.println(a / b);
	}
}
