import java.util.*;

public class qs8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		boolean flag = true;

		System.out.println("Enter the number in row major order: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && arr[i][j] != 1) {
					flag = false;
					break;
				}
				if (i != j && arr[i][j] != 0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag ? "The matrix is an Identity Matrix" : "The matrix is not an Identity Matrix");
		sc.close();

	}
}
