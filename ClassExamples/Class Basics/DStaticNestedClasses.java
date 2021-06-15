public class DStaticNestedClasses {
	public static void main(String[] args) {
		faculty.faculty.eligibleLeave.displayLeaveDetails();
		faculty f1 = new faculty("SUBHAM", "828282");
		f1.l1.testMethod1();
	}
}

class faculty {
	private String name;
	private String empid;
	private static int count = 1;

	public faculty(String name, String empid) {
		this.name = name;
		this.empid = empid;
	}

	// A static nested class cannot access the outer class non static members
	// A static nested class can only access only static members of outer class
	// A static class can have non static members and methods
	// An object for the static nested class can be created and accessed using the object of the outer class

	public static class eligibleLeave {
		public static int el = 12;
		public static int ml = 20;
		public static int cl = 10;

		public int var1 = 0;

		public static void displayLeaveDetails() {
			System.out.println("The number of EL is " + el);
			System.out.println("The number of ML is " + ml);
			System.out.println("The number od CL is " + cl);

			// System.out.println(name); // Cannot access non static memmbers of outer class
			System.out.println(count); //CAN access static memebers only
		}

		// CANNOT ACCESS NON STATIC MEMBERS EVEN INSIDE NON STATIC MEMBERS of outer class INSIDE A STATIC NESTED CLASS
		// public void testMethod() {
		// 	System.out.println(name);
		// }

		public void testMethod1() {
			System.out.println(var1); // CAN ACCESS NON STATIC DATA MEMBERS OF THE NESTED CLASS ITSELF
		}
	}

	eligibleLeave l1 = new eligibleLeave();
}