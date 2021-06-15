import java.util.*;

public class qs10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];

		System.out.println("Enter the number in row major order: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nThe matrix entered is: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nThe sum of rows of the matrix are: ");
		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += arr[i][j];
			}
			System.out.println(sum);
		}

		sc.close();
	}
}
