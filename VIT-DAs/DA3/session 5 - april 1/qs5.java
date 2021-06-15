import java.util.*;

public class qs5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the number of students whose mark you want to enter: ");
			int n = sc.nextInt();
			int[] marks = new int[n];
			for (int i = 0; i < marks.length; i++) {
				System.out.print("Enter the marks of student " + (i + 1) + ": ");
				marks[i] = sc.nextInt();
				if (marks[i] < 0) {
					throw new marksNotInRangeException("Marks cannot be less than 0");
				} else if (marks[i] > 100) {
					throw new marksNotInRangeException("Marks cannot be greater than 100");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Input type for mark should be a number only");
		} catch (marksNotInRangeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}

class marksNotInRangeException extends Exception {
	marksNotInRangeException(String s) {
		super(s);
	}
}
