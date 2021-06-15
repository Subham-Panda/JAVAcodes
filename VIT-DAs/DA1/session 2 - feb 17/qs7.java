import java.util.*;

public class qs7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of elements: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number to search: ");
		int search = sc.nextInt();

		int position = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == search) {
				position = i;
				break;
			}
		}

		if (position == -1) {
			System.out.println("Number " + search + " not found");
		} else {
			System.out
					.println("Number " + search + " found at index position " + position);
		}

		sc.close();

	}
}
