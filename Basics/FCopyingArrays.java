public class FCopyingArrays {
	public static void main(String[] args) {
		
		/*
		***********************
		1-D array copying
		************************
		*/
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = new int[5];
		b = a; // b and a apoint to same memory location

		b = a.clone(); // b and a are diff

		System.arraycopy(a, 2, b, 0, 3); // Copy from index 2 of array to index 0 to 3 of array b. So b = 3,4,5,0,0


		/*
		***************************
		2-D array copying
		***************************
		*/

		int c[][] = { { 1, 2 }, { 3, 4 } };
		int d[][] = new int[2][2];

		d = c.clone(); // will create shallow copy , d = c here

		//To make deep copy of 2d array have to copy each element individually

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				d[i][j] = c[i][j];
			}
		}

	}
}
