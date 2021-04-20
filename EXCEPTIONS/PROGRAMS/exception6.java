package EXCEPTIONS.PROGRAMS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if (num2 == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			if (num1 == 13 || num2 == 13) {
				throw new myException("I dont like number 13");
			}
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) { // catching arithmetic exception
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Enter correct input");
		} catch (myException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) { // ! Exception always last catch block
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}

class myException extends Exception {
	public myException(String message) {
		super(message);

	}
}
