import java.util.InputMismatchException;
import java.util.Scanner;

public class qs7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		try {
			System.out.print("Enter the number of employees: ");
			int n = sc.nextInt();
			employee emparr[] = new employee[n];
			for (int i = 0; i < n; i++) {
				System.out.println("-----ENTER DETAILS OF EMPLOYEE " + (i + 1) + " -----");
				System.out.print("Enter employee id: ");
				String empid = sc1.nextLine();
				System.out.print("Enter name: ");
				String name = sc1.nextLine();
				System.out.print("Enter age: ");
				int age = sc.nextInt();
				if (age > 60 || age < 25) {
					throw new AgeException("Age not in the range");
				}
				System.out.print("Enter designation: ");
				String designation = sc1.nextLine();
				System.out.print("Enter years of experiecne: ");
				int yearsOfExperience = sc.nextInt();
				if(yearsOfExperience > 20 || yearsOfExperience < 5) {
					throw new ExperienceException("Experience does not Match");
				}
				System.out.print("Enter department: ");
				String department = sc1.nextLine();
				System.out.print("Enter salary: ");
				int salary = sc.nextInt();
				if (salary > 500000 || salary < 5000) {
					throw new SalaryException("Salary does not fall within the range");
				}
				emparr[i] = new employee(empid, name, age, designation, yearsOfExperience, department, salary);

			}
		} catch (SalaryException e) {
			System.out.println(e.getMessage());
		} catch (AgeException e) {
			System.out.println(e.getMessage());
		} catch (ExperienceException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Enter the correct type of data");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			sc1.close();
			System.out.println("Thanks for using our Software");
		}
	}
}

class employee {
	String empid;
	String name;
	int age;
	String designation;
	int yearsOfExperience;
	String department;
	int salary;

	employee(String empid, String name, int age, String designation, int yearsOfExperience, String department,
			int salary) {
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.yearsOfExperience = yearsOfExperience;
		this.department = department;
		this.salary = salary;
	}
}

class ExperienceException extends Exception {
	ExperienceException(String S) {
		super(S);
	}
}

class SalaryException extends Exception {
	SalaryException(String S) {
		super(S);
	}
}

class AgeException extends Exception {
	AgeException(String S) {
		super(S);
	}
}