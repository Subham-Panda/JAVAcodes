import java.util.*;

public class qs5 {

	static int removeDuplicates(int arr[], int n) {
		if(n==0 || n==1)
			return n;
		
		int j = 0;

		for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
       
        arr[j++] = arr[n-1];
       
        return j;
	}
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

		n = removeDuplicates(arr, n);

		System.out.println("\n\nArray after being sorted and duplicates removed:");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}

		sc.close();
	}
}
