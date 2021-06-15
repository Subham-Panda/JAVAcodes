// import java.util.Scanner;

// public class qs3 {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		dependent a[] = new dependent[4];
// 		System.out.println("---ENTER DETAILS OF PROFESSOR---");
// 		a[0] = new professor();
// 		System.out.println("---ENTER DETAILS OF ASSOCIATE PROFESSOR---");
// 		a[1] = new associateProfessor();
// 		System.out.println("---ENTER DETAILS OF ASSISTANT PROFESSOR---");
// 		a[2] = new assistantProfessor();
// 		System.out.println("---ENTER DETAILS OF TRA---");
// 		a[3] = new TRA();
// 		System.out.print("Enter the employee id to search: ");
// 		String id = sc.nextLine();
// 		dependent.findEmployee(a, id);
// 		sc.close();
// 	}
// }

// class dependent {
// 	String empid;
// 	String name;
// 	String phoneno;
// 	String dob;
// 	double sal;

// 	dependent() {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter employee id: ");
// 		empid = sc.nextLine();
// 		System.out.print("Enter name: ");
// 		name = sc.nextLine();
// 		System.out.print("Enter phone number: ");
// 		phoneno = sc.nextLine();
// 		System.out.print("Enter date of birth: ");
// 		dob = sc.nextLine();
// 		// sc.close();
// 	}

// 	public void displayDetails() {
// 		System.out.println(empid + " " + name + " " + phoneno + " " + dob + " " + sal);
// 	}

// 	public static void findEmployee(dependent x[], String id) {
// 		int flag = 0;
// 		for (int i = 0; i < x.length; i++) {
// 			if (x[i].empid.equals(id)) {
// 				x[i].displayDetails();
// 				flag = 1;
// 				break;
// 			}
// 		}
// 		if (flag == 0) {
// 			System.out.println("EMPLOYEE NOT FOUND");
// 		}
// 	}

// }

// class professor extends dependent {
// 	professor() {
// 		super();
// 		sal = 150000 + (0.3 * 150000);

// 	}
// }

// class associateProfessor extends dependent {
// 	associateProfessor() {
// 		super();
// 		sal = 120000 + (0.2 * 120000);
// 	}
// }

// class assistantProfessor extends dependent {
// 	assistantProfessor() {
// 		super();
// 		sal = 100000 + (0.1 * 100000);
// 	}
// }

// class TRA extends dependent {
// 	TRA() {
// 		super();
// 		sal = 20000;
// 	}
// }
