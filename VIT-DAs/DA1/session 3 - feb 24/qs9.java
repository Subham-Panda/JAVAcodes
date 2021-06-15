import java.util.*;

//class 1
class College {
	String collegeName = "Indian Institute of Technology";
	int collegeAge;
	String director;
	String dean;

	// only for admin
	// updated values
	public void setCollegeDetails(int collegeAge, String director, String dean) {
		this.collegeAge = collegeAge;
		this.director = director;
		this.dean = dean;
	}

	public void GetCollegeDetails() {
		System.out.println("College Name :" + collegeName + "\nCollege Age : " + collegeAge + "\nDirector :" + director
				+ "\nDean : " + dean);
	}
}

// class 2
class Faculty extends College {

	String qualification;
	int age;
	String department;
	String specialization, name, address;

	// only for admin
	public void setFacultyDetails(int age, String qualification, String department, String specialization, String name,
			String address) {
		this.age = age;
		this.qualification = qualification;
		this.department = department;
		this.specialization = specialization;
		this.name = name;
		this.address = address;

	}

	public void getFacultyDetails() {
		System.out.println("Name :" + name + "\nAge : " + age + "\nQualification:" + qualification + "\nDepartment : "
				+ department + "\nSpecialization : " + specialization + "\nAddress : " + address);
	}

}

// class 3
class Student extends College {

	String year;
	int age;
	String department;
	String branch, name, address;

	// only for admin
	public void setStudentDetails(int age, String year, String department, String branch, String name, String address) {
		this.age = age;
		this.year = year;
		this.department = department;
		this.branch = branch;
		this.name = name;
		this.address = address;

	}

	public void getStudentDetails() {
		System.out.println("Name :" + name + "\nAge : " + age + "\nyear:" + year + "\nDepartment : " + department
				+ "\nBranch : " + branch + "\nAddress : " + address);
	}

}

// class 4
class Course extends College {

	String courseName;
	int faculty;
	String department;

	// only for admin
	public void setCourseDetails(String courseName, String department, String facutly) {
		this.courseName = courseName;
		this.faculty = faculty;
		this.department = department;

	}

	public void getCourseDetails() {
		System.out.println("Name :" + courseName + "\nDepartment : " + department + "\nFaculty : " + faculty);
	}

}

class Department extends College {

	String departmentName;
	String departmentHead;
	int totalFaculty;

	public void setDepartmentDetails(String departmentName, String departmentHead, int totalFacutly) {
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.totalFaculty = totalFaculty;

	}

	public void getDepartmentDetails() {
		System.out.println("Department Name :" + departmentName + "\nDepartment HOD : " + departmentHead
				+ "\nToatal Faculty : " + totalFaculty);
	}

}


class Sports extends College {

	String sportName, captain;
	int duration;

	public void setSportDetails(String sportName, String captain, int duration) {
		this.sportName = sportName;
		this.captain = captain;
		this.duration = duration;

	}

	public void getSportDetails() {
		System.out.println("Sport Name :" + sportName + "\nCaptain : " + captain + "\nduration : " + duration);
	}

}


class CollegFest extends College {

	String festName, festSecretery;
	int duration;

	public void setFestDetails(String festName, String festSecretery, int duration) {
		this.festName = festName;
		this.festSecretery = festSecretery;
		this.duration = duration;

	}

	public void getFestDetails() {
		System.out.println(
				"Fest Name :" + festName + "\nFest Sectretery : " + festSecretery + "\nduration : " + duration);
	}

}

class Hostel extends College {

	String hostelName, hostelType, hostelIncharge;

	public void setHostelDetails(String hostelName, String hostelType, String hostelIncharge) {
		this.hostelName = hostelName;
		this.hostelType = hostelType;
		this.hostelIncharge = hostelIncharge;

	}

	public void getHostelDetails() {
		System.out.println("Hostel Name :" + hostelName + "\nHostel Type : " + hostelType + "\nHostel Incharge : "
				+ hostelIncharge);
	}

}

class CollegeCanteen extends College {
	String canteenName;
	int canteenStartTime, canteenEndTime;
	boolean canteenOpen;

	public void setCanteenDetails(String canteenName, int canteenStartTime, int canteenEndTime, boolean canteenOpen) {
		this.canteenName = canteenName;
		this.canteenStartTime = canteenStartTime;
		this.canteenEndTime = canteenEndTime;
		this.canteenOpen = canteenOpen;

	}

	public void getCanteenDetails() {
		System.out.println("Canteen Name :" + canteenName + "\nCanteen Open : " + canteenOpen
				+ "\nCanteen Start Time : " + canteenStartTime + "\nCanteen Close Time : " + canteenEndTime);
	}

}


public class qs9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.println("ENTER FACULTY DETAILS");
		System.out.println("Enter age: ");
		int age = sc1.nextInt();
		System.out.println("Enter qualification: ");
		String qualification = sc.nextLine();
		System.out.println("Enter department: ");
		String department = sc.nextLine();
		System.out.println("Enter specialization: ");
		String specialization = sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		Faculty f1 = new Faculty();
		f1.setFacultyDetails(age, qualification, department, specialization, name, address); 
		f1.getFacultyDetails();

		System.out.println("ENTER STUDENT DETAILS");
		System.out.println("Enter age: ");
		int sage = sc1.nextInt();
		System.out.println("Enter name: ");
		String sname = sc.nextLine();
		System.out.println("Enter department: ");
		String sdepartment = sc.nextLine();
		System.out.println("Enter year: ");
		String syear = sc.nextLine();
		System.out.println("Enter branch: ");
		String sbranch = sc.nextLine();
		System.out.println("Enter address: ");
		String saddress = sc.nextLine();
		Student s1 = new Student();
		s1.setStudentDetails(sage, syear, sdepartment, sbranch, sname, saddress);
		s1.getStudentDetails();

		sc.close();
		sc1.close();

	}
}