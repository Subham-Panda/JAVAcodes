import java.util.*;

public class qs3 {

	static String reverse(String a) {
		StringBuilder s = new StringBuilder();
		s.append(a);
		s.reverse();
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String line = sc.nextLine();
		String[] arr = line.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reverse(arr[i]);
		}
		System.out.println("Required reverse sentence is: "+String.join(" ", Arrays.asList(arr)));
		sc.close();
	}
}
