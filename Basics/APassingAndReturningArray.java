public class APassingAndReturningArray {
	public static void main(String[] args) {
		int marks[] = { 1, 2, 3, 4, 5, 6 };

		display(marks);
		int narr[] = doubleArr(marks);
		display(narr);
	}
	
	//public static void display(int a[][])
	public static void display(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	//public static int[][] doubleArr(int a[][])
	public static int[] doubleArr(int a[]) {
		for (int i = 0; i < a.length;i++) {
			a[i] *= 2;
		}
		return a;
	}
}
