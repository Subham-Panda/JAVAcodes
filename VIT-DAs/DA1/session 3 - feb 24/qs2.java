import java.util.*;

public class qs2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] regNos = new String[5];
		int index=0;
		while (index < 5) {
			System.out.print("Enter registration number " + (index + 1) + ": ");
			regNos[index] = sc.nextLine();
			if (regNos[index].contains("BEC")) {
				System.out.println("\nRegistration number should not belong to BEC\n");
				continue;
			}
			index++;
		}

		String temp;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < (5 - i); j++) {
				if (regNos[j - 1].compareTo(regNos[j]) > 0) {
					temp = regNos[j - 1];
					regNos[j - 1] = regNos[j];
					regNos[j] = temp;
				}
			}
		}

		System.out.println("\n\nThe sorted array of registrations numbers are: ");
		for (int i = 0; i < 5; i++) {
			System.out.println(regNos[i]);
		}

		sc.close();
	}
}
