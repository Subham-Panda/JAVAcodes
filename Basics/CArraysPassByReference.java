public class CArraysPassByReference {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		modifyArray(arr);
		System.out.println(arr[0]);
	}

	public static void modifyArray(int a[]) {
		a[0] = 9999;
	}
}


