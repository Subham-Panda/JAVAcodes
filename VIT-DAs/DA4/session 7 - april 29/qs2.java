import java.util.InputMismatchException;
import java.util.Scanner;

public class qs2 {
	public static void main(String[] args) {
		try {
			calculator c = new calculator();
			c.add();
			c.divide();
			c.display_namelength();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please Enter integers for numbers");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thanks for using Our Software");
		}

	}
}

class calculator {
	String name;
	int num1;
	int num2;

	public calculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name");
		this.name = input.nextLine();
		System.out.println("Enter the first number");
		this.num1 = input.nextInt();
		System.out.println("Enter the second number");
		this.num2 = input.nextInt();
		input.close();

	}

	public void add() {
		System.out.println(num1 + num2);
	}

	public void divide() throws ArithmeticException {
		if (num2 == 0)
			throw new ArithmeticException("Cannot divide number by 0");
		System.out.println(num1 / num2);
	}

	public void display_namelength() {
		System.out.println(name.length());
	}
}
