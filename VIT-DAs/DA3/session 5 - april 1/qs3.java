import java.util.*;

public class qs3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			dependent a[] = new dependent[4];
			System.out.println("---ENTER DETAILS OF PROFESSOR---");
			a[0] = new professor();
			System.out.println("---ENTER DETAILS OF ASSOCIATE PROFESSOR---");
			a[1] = new associateProfessor();
			System.out.println("---ENTER DETAILS OF ASSISTANT PROFESSOR---");
			a[2] = new assistantProfessor();
			System.out.println("---ENTER DETAILS OF TRA---");
			a[3] = new TRA();
			System.out.print("Enter the employee id to search: ");
			String id = sc.nextLine();
			dependent.findEmployee(a, id);
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
		}

	}
}

class dependent {
	String empid;
	String name;
	String phoneno;
	String dob;
	double sal;

	dependent() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter employee id: ");
			empid = sc.nextLine();
			System.out.print("Enter name: ");
			name = sc.nextLine();
			System.out.print("Enter phone number: ");
			phoneno = sc.nextLine();
			System.out.print("Enter date of birth: ");
			dob = sc.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the correct input!");
		} catch (Exception e) {
			System.out.println("Sorry for the inconvinience caused!");
			System.out.println(e.getMessage());
		}

		// sc.close();
	}

	public void displayDetails() {
		System.out.println(empid + " " + name + " " + phoneno + " " + dob + " " + sal);
	}

	public static void findEmployee(dependent x[], String id) {
		try {
			int flag = 0;
			for (int i = 0; i < x.length; i++) {
				if (x[i].empid.equals(id)) {
					x[i].displayDetails();
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("EMPLOYEE NOT FOUND");
			}
		} catch (NullPointerException e) {
			System.out.println("The object you are trying to reference doesnt point to any location in memory");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are tryng to access an index which is larger than the array");
		} catch (Exception e) {
			System.out.println("Sorry for the inconvinience caused!");
			System.out.println(e.getMessage());
		}
	}
}

class professor extends dependent {
	professor() {
		super();
		sal = 150000 + (0.3 * 150000);

	}
}

class associateProfessor extends dependent {
	associateProfessor() {
		super();
		sal = 120000 + (0.2 * 120000);
	}
}

class assistantProfessor extends dependent {
	assistantProfessor() {
		super();
		sal = 100000 + (0.1 * 100000);
	}
}

class TRA extends dependent {
	TRA() {
		super();
		sal = 20000;
	}
}
