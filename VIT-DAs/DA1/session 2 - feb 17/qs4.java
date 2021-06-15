import java.util.*;

public class qs4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of elements: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array:");

		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		sc.close();
	}
}
