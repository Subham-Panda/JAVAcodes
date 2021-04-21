import java.util.Scanner;

public class exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try{
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println(num1/num2);
		} catch (ArithmeticException e) { // catching arithmetic exception
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
