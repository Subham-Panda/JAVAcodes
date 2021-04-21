import java.util.Scanner;

public class exception4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try{
			int num1=sc.nextInt();
			int num2 = sc.nextInt();
			if (num2 == 0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			System.out.println(num1/num2);
		} catch (Exception e) { // catching arithmetic exception
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
