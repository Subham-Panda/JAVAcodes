import java.util.*;

public class qs2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		try {
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
		} catch (InputMismatchException e) {
			System.out.println("Please enter the correct input!");
		} catch (NullPointerException e) {
			System.out.println("The object you are trying to reference doesnt point to any location in memory");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are tryng to access an index which is larger than the array");
		} catch (Exception e) {
			System.out.println("Sorry for the inconvinience caused!");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			sc1.close();

		}
	}
}

class student {
	String Name;
	String Regno;
	String Phone;

	void getinfo(String Name, String Regno, String Phone) {
		this.Name = Name;
		this.Regno = Regno;
		this.Phone = Phone;
	}

	public void displayinfo() {
		System.out.println(Name + " " + Regno + " " + Phone);
		System.out.println();
	}

	public static void sortobj(student s[]) {
		try {
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
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured during Sorting the Array of student objects");
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception occured during Sorting the Array of student objects");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are tryng to access an index which is larger than the array");
		} catch (Exception e) {
			System.out.println("Some Error occured while sorting the array of student objects");
			System.out.println(e.getMessage());
		}

	}
}