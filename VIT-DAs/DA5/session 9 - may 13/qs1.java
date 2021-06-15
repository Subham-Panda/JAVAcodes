import java.util.*;

public class qs1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		try {
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter first number: ");
			int num1 = sc1.nextInt();
			System.out.print("Enter second number: ");
			int num2 = sc1.nextInt();
			calculator c = new calculator(name, num1, num2);
			c.add();
			c.divide();
			c.display_namelength();
		} catch (InputMismatchException e) {
			System.out.println("Please enter correct type for Name and Number");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide number by zero");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			sc1.close();
		}
		
	}
}

class calculator {
	String name;
	int num1;
	int num2;

	public calculator(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}

	public void add() {
		System.out.println(num1 + num2);
	}

	public void divide() {
		System.out.println(num1 / num2);
	}

	public void display_namelength() {
		System.out.println(name.length());
	}
}