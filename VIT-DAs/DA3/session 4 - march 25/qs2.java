import java.util.*;

public class qs2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n = sc1.nextInt();
		student st[] = new student[n];
		for (int i = 0; i < st.length; i++) {
			String name;
			String regno;
			String phone;
			st[i] = new student();
			System.out.println("Input Details of Student " + (i + 1));
			System.out.print("Enter Name: ");
			name = sc.nextLine();
			System.out.print("Enter Reg number: ");
			regno = sc.nextLine();
			System.out.print("Enter Phone: ");
			phone = sc.nextLine();
			st[i].getinfo(name, regno, phone);
			System.out.println();
		}
		student.sortobj(st);
		sc.close();
		sc1.close();
	}
}

class student {
	String Name;
	String Regno;
	String Phone;

	void getinfo(String Name,String Regno,String Phone) {
		this.Name=Name;
		this.Regno=Regno;
		this.Phone=Phone;
	}

	public void displayinfo() {
		System.out.println(Name + " " + Regno + " " + Phone);
		System.out.println();
	}

	public static void sortobj(student s[]) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].Name.compareTo(s[j + 1].Name) > 0) {
					student temp = new student();
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			s[i].displayinfo();
		}
	}
}