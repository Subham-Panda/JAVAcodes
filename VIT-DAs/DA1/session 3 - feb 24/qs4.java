import java.util.*;

public class qs4 {
	static int countOccurences(String str, String word) {
		String a[] = str.split("\\s+");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i]))
				count++;
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sentence: ");
		String line = sc.nextLine();
		String[] arr = line.split("\\s+");
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], countOccurences(line, arr[i]));
		}

		System.out.println("The occurences of each word in the Sentence is: ");
		for (Map.Entry<String, Integer> e : m.entrySet())
			System.out.println(e.getKey() + " : " + e.getValue());
		sc.close();
	}
}
