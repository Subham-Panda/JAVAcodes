import java.util.*;

public class qs11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int c = sc.nextInt();

		int a[][] = new int[r][c];

		System.out.println("\nEnter the numbers of first matrix in row major order: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nEnter the numbers of second matrix in row major order: ");
		int temp = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				temp = sc.nextInt();
				a[i][j] += temp;
			}
		}

		System.out.println("\n\nThe sum of the matrices are: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
