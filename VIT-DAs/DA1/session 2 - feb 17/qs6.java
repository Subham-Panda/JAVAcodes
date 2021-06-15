import java.util.*;

public class qs6 {
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

		for(int i=0; i<n/2; i++){
			int temp = arr[i];
			arr[i] = arr[n -i -1];
			arr[n -i -1] = temp;
		  }
		  
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}

		sc.close();

	}
}