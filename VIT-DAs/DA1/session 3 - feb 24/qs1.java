import java.util.*;

public class qs1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");
		String pass = sc.nextLine();
		if (username.length() == 0 || pass.length() == 0) {
			System.out.println("Username or Password is empty");
			sc.close();
			return;
		}
		if (pass.length() < 8) {
			System.out.println("Password should me minimum 8 characters long");
			sc.close();
			return;
		}
		if (pass.contains(username)) {
			System.out.println("Password contains username");
			sc.close();
			return;
		}

		System.out.print("Confirm password: ");
		String confPass = sc.nextLine();
		if (!confPass.equals(pass)) {
			System.out.println("Passwords do not match");
			sc.close();
			return;
		}
		sc.close();
	}
}
