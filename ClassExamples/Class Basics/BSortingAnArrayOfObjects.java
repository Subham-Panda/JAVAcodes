import java.util.Scanner;

public class BSortingAnArrayOfObjects {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		Student s[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("-----Enter details for student " + (i + 1) + "-----");
			System.out.print("Enter name: ");
			String name = sc1.nextLine();
			System.out.print("Enter marks: ");
			int marks = sc.nextInt();
			s[i] = new Student(name, marks);
		}
		Student.sortStudentsByMarks(s);
		System.out.println("SORTED STUDENTS");
		for (int i = 0; i < n; i++) {
			System.out.println("NAME: " + s[i].name + ", MARKS: " + s[i].marks);
		}
		sc.close();
		sc1.close();
	}
}

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	// functions sorts by greatest marks first
	public static void sortStudentsByMarks(Student a[]) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j].marks < a[j + 1].marks) {
					Student temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
}
