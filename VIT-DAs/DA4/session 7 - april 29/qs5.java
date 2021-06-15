import java.io.*;
import java.util.Scanner;

public class qs5 {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		int num = 3;
		student sOutArr[] = new student[num];
		File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/student.txt");
		FileOutputStream fout = new FileOutputStream(obj);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		for (int i = 0; i < num; i++) {
			System.out.println("-----ENTER DETAILS OF STUDENT " + (i + 1) + " -----");
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter registration number: ");
			String regno = sc.nextLine();
			System.out.print("Enter email: ");
			String emailid = sc.nextLine();
			System.out.print("Enter address: ");
			String address = sc.nextLine();
			sOutArr[i] = new student(name, regno, emailid, address);
			objout.writeObject(sOutArr[i]);
		}
		objout.close();
		fout.close();
		sc.close();

		FileInputStream fin = new FileInputStream(obj);
		ObjectInputStream objin = new ObjectInputStream(fin);
		student sInpArr[] = new student[num];
		for (int i = 0; i < num; i++) {
			sInpArr[i] = (student) objin.readObject();
		}
		objin.close();
		fin.close();
		int flag = 0;
		for (student s : sInpArr) {
			if (s.regno.substring(2, 5).toLowerCase().compareTo("bce")==0 && s.address.toLowerCase().contains("vellore")) {
				flag = 1;
				s.displayinfo();
			}
		}
		if (flag == 0) {
			System.out.println("No Such Students Match the Criteria");
		}

	}
}

class student implements Serializable {
	String name;
	String regno;
	String emailid;
	String address;

	student(String name, String regno, String emailid, String address) {
		this.name = name;
		this.regno = regno;
		this.emailid = emailid;
		this.address = address;
	}

	public void displayinfo() {
		System.out.println("Name: " + name + ",Regno: " + regno + ",EmailId: " + emailid + ",Address: " + address);
	}
}
