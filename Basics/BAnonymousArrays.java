public class BAnonymousArrays {
	public static void main(String[] args) {
		display(new int[] { 1, 2, 3, 4, 5 }); // Anonymous arrays
		//2d anonymous array - int[] {{1,2},{3,4},{5,6}}
	}
	
	public static void display(int a[]) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
