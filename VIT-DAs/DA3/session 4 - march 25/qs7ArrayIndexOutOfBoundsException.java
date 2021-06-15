public class qs7ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		try {
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array length is 5, cant access an element more than index 4");
		}

	}
}