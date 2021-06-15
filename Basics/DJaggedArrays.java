public class DJaggedArrays {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 }, { 7, 8, 9, 10 } }; // JAGGED ARRAY - number of columns of each row
																		// can be diff

		//Another way
		// int m[][] = new int[4][];
		// m[0] = new int[] { 1, 1, 1, 1 };
		// m[1] = new int[] { 1, 2 };
		// m[2] = new int[] { 1, 1, 1 };
		// m[3] = new int[] { 1, 1, 1, 1, 2, 3, 4, 5 };

		for (int k[] : a) {
			for (int i : k) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
