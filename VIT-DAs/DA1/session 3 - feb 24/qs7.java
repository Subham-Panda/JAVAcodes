import java.util.*;

public class qs7 {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username: ");
		String username = sc.nextLine();
		System.out.println("Enter the password: ");
		String password = sc.nextLine();
		String temp;
		for (int i = 0; i < username.length() - 2; i++)

		{

			temp = username.substring(i, i + 3);
			if (password.indexOf(temp) != -1)

			{
				System.out.println("It is a weak password");
				break;

			}
		}

		sc.close();

	}

}