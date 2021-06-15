import java.util.*;

public class qs10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		String num = sc.next();
		StringBuilder input1 = new StringBuilder();
		input1.append(num);
		input1.reverse();
		if ((Integer.parseInt(num) + Integer.parseInt(input1.toString())) % 2 != 0) {
			System.out.println(String.valueOf(num) + " has Odd Sum property");
		} else {
			System.out.println(String.valueOf(num) + " has no Odd Sum property");
		}
		sc.close();
	}
}
