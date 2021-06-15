import java.util.*;

public class qs9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];
		int transpose[][] = new int[c][r];

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

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		System.out.println("\nThe transpose matrix is: ");
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}
}