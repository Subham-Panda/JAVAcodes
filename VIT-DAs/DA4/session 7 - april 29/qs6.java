import java.io.*;
import java.util.Scanner;

public class qs6 {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int num = 4;
		course cOutArr[] = new course[num];
		File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/course.txt");
		FileOutputStream fout = new FileOutputStream(obj);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		for (int i = 0; i < num; i++) {
			System.out.println("-----ENTER DETAILS OF COURSE " + (i + 1) + " -----");
			System.out.print("Enter course ID: ");
			String courseID = sc.nextLine();
			System.out.print("Enter course name: ");
			String courseName = sc.nextLine();
			System.out.print("Enter who is offering the course: ");
			String courseOfferedBy = sc.nextLine();
			System.out.print("Enter slot: ");
			String Course_slot = sc.nextLine();
			cOutArr[i] = new course(courseID, courseName, courseOfferedBy, Course_slot);
			objout.writeObject(cOutArr[i]);
		}
		objout.close();
		fout.close();
		sc.close();

		FileInputStream fin = new FileInputStream(obj);
		ObjectInputStream objin = new ObjectInputStream(fin);
		course cInpArr[] = new course[num];
		for (int i = 0; i < num; i++) {
			cInpArr[i] = (course) objin.readObject();
		}
		objin.close();
		fin.close();
		int flag = 0;
		for (course c : cInpArr) {
			if (c.courseName.compareToIgnoreCase("java programming")==0 && c.Course_slot.compareToIgnoreCase("c1")==0 && c.courseOfferedBy.compareToIgnoreCase("scope") == 0) {
				flag = 1;
				c.displayinfo();
			}
		}
		if (flag == 0) {
			System.out.println("No Such Courses Match the Criteria");
		}

	}
}

class course implements Serializable {
	String courseID;
	String courseName;
	String courseOfferedBy;
	String Course_slot;

	course(String courseID, String courseName, String courseOfferedBy, String Course_slot) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseOfferedBy = courseOfferedBy;
		this.Course_slot = Course_slot;
	}

	public void displayinfo() {
		System.out.println("Course ID: " + courseID + ",Course Name: " + courseName + ",Course Offered By: " + courseOfferedBy + ",Course Slot: " + Course_slot);
	}
}
