import java.util.InputMismatchException;
import java.util.Scanner;

public class qs1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Username: ");
			String user = sc.nextLine();
			System.out.print("Enter Password: ");
			String pass = sc.nextLine();
			System.out.print("Confirm Password: ");
			String cnfpass = sc.nextLine();
			if (user.length() < 8) {
				System.out.println("Invalid username length");
			}
			if (pass.length() < 8) {
				System.out.println("Invalid password length");
			}
			if (user.contains(" ") || pass.contains(" ")) {
				System.out.println("Username or Password should not contain spaces.");
			}
			if (pass.equals(cnfpass) != true) {
				System.out.println("Passwords don’t match.");
			}
			String temp = "";
			for (int i = 0; i < user.length() - 2; i++) {
				for (int j = i; j < i + 3; j++) {
					temp += user.charAt(j);
				}
				if (pass.contains(temp)) {
					System.out.println("Password cannot contain username ");
					break;
				} else {
					temp = "";
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter the correct input!");
		} catch (Exception e) {
			System.out.println("Sorry for the inconvinience caused!");
			System.out.println(e.getMessage());
		} finally {
			sc.close();

		}

	}
}
