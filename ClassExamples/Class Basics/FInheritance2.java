import java.util.*;
import java.io.*;

public class FInheritance2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter number of students for whom you need to check eligibility: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("ENTER DETAILS FOR CANDIDATE 1");
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter day of birth: ");
			int dayOfBirth = sc1.nextInt();
			System.out.println("Enter month of birth: ");
			int monthOfBirth = sc1.nextInt();
			System.out.println("Enter year of birth: ");
			int yearOfBirth = sc1.nextInt();
			System.out.println("Enter address: ");
			String address = sc.nextLine();
			System.out.println("Enter community: ");
			String community = sc.nextLine();
			System.out.println("Enter reg num: ");
			String regnum = sc.nextLine();
			System.out.println("Enter mode: ");
			String mode = sc.nextLine();
			System.out.println("Enter school: ");
			String school = sc.nextLine();
			System.out.println("Enter mark 1: ");
			int mark1 = sc1.nextInt();
			System.out.println("Enter mark 2: ");
			int mark2 = sc1.nextInt();
			System.out.println("Enter mark3: ");
			int mark3 = sc1.nextInt();
			VITAdmission2020 v = new VITAdmission2020(regnum, mode, school, mark1, mark2, mark3, name, dayOfBirth,
					monthOfBirth, yearOfBirth, address, community);
			v.determineEligiblity();
		}

	}
}

class Person {
	String name;
	int dayOfBirth;
	int monthOfBirth;
	int yearOfBirth;
	String address;
	String community;

	public Person(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String community) {
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.community = community;
	}

	public void display() {
		System.out.println("Name: "+name+", Date of birth: "+dayOfBirth+"/"+monthOfBirth+"/"+yearOfBirth+", Address: "+address+", Community: "+community);
	}
}

class Student extends Person {
	String regnum;
	String mode;
	String school;
	int mark1;
	int mark2;
	int mark3;

	public Student(String regnum, String mode, String school, int mark1, int mark2, int mark3, String name,
			int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String community) {
		super(name, dayOfBirth, monthOfBirth, yearOfBirth, address, community);
		this.regnum = regnum;
		this.mode = mode;
		this.school = school;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public void display() {
		super.display();
		System.out.println("Reg no: "+regnum+", Mode: "+mode+", School: "+school+", Mark 1: "+mark1+", Mark 2: "+mark2+", Mark 3: "+mark3);
	}
}

class VITAdmission2020 extends Student {
	public VITAdmission2020(String regnum, String mode, String school, int mark1, int mark2, int mark3, String name,
			int dayOfBirth, int monthOfBirth, int yearOfBirth, String address, String community) {
		super(regnum, mode, school, mark1, mark2, mark3, name, dayOfBirth, monthOfBirth, yearOfBirth, address,
				community);
	}
	public void determineEligiblity() {
		if (!(dayOfBirth >= 1 && monthOfBirth >= 7 && yearOfBirth >= 1998)) {
			System.out.println("Candidate doesnt satisfy date of birth criteria. So not eligible");
		} else if ((mark1 + mark2 + mark3) / 3 < 60 && community.compareTo("SC/ST")!=0) {
			System.out.println("Aggregate of the three marks is less than 60. So not eligible");
		} else if ((mark1 + mark2 + mark3) / 3 < 50 && community.compareTo("SC/ST") == 0) {
			System.out.println("Aggregate of the three marks for SC/ST is less than 50. So not eligible");
		} else if (mode.compareTo("Regular") != 0 || mode.compareTo("Full Time") != 0) {
			System.out.println("Candidates who have studied in Regular, Full Time are alone Eligible");
		} else {
			System.out.println("CANDIDATE IS ELIGIBLE FOR ADMISSION");
		}
	}
}