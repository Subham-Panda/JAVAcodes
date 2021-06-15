import java.io.*;
import java.util.*;

public class qs3 {
	public static void main(String[] args) throws InterruptedException {
		FileOperation foper = new FileOperation();
		Thread thr1 = new Thread((Runnable) () -> {
			foper.writeObjects();
		});
		Thread thr2 = new Thread((Runnable) () -> {
			try {
				foper.readObjects();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		});
		thr1.start();
		thr2.start();
		thr1.join();
		thr2.join();
	}
}

class faculty implements Serializable {
	String id;
	String designation;
	String name;
	String gender;

	faculty(String id, String designation, String name, String gender) {
		this.id = id;
		this.designation = designation;
		this.name = name;
		this.gender = gender;
	}

	faculty() {
		this.id = "";
		this.name = "";
		this.designation = "";
		this.gender = "";
	}

	public void displayInfo() {
		System.out.println(
				"Faculty id: " + id + ", Name: " + name + ", Designation: " + designation + ", Gender: " + gender);
	}

	public static void sortAndDisplayFacultyByNames(faculty[] farr) {
		for (int i = 0; i < farr.length - 1; i++) {
			for (int j = 0; j < farr.length - i - 1; j++) {
				if (farr[j].name.compareTo(farr[j + 1].name) > 0) {
					faculty temp = new faculty();
					temp = farr[j];
					farr[j] = farr[j + 1];
					farr[j + 1] = temp;
				}
			}
		}
		System.out.println("THE SORTED LIST OF NAMES IS");
		for (faculty f : farr) {
			System.out.println(f.name);
		}
	}
}

class FileOperation {
	private boolean fileBusy = false;

	public synchronized void writeObjects() {
		try {
			this.fileBusy = true;
			Scanner sc = new Scanner(System.in);
			faculty farr[] = new faculty[5];
			File obj = new File("faculty.txt");
			FileOutputStream fout = new FileOutputStream(obj);
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			for (int i = 0; i < 5; i++) {
				System.out.println("-----ENTER DEATILS FOR FACULTY " + (i + 1) + " -----");
				System.out.print("Enter id: ");
				String id = sc.nextLine();
				System.out.print("Enter name: ");
				String name = sc.nextLine();
				System.out.print("Enter designation: ");
				String designation = sc.nextLine();
				System.out.print("Enter gender(Male/Female): ");
				String gender = sc.nextLine();
				farr[i] = new faculty(id, designation, name, gender);
				objout.writeObject(farr[i]);
			}
			this.fileBusy = false;
			notifyAll();
			objout.close();
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the objin of correct type");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	public synchronized void readObjects() throws InterruptedException, FileNotFoundException {
		faculty farr[] = new faculty[5];
		System.out.println("WAITING TO READ FILE faculty.txt");
		while (fileBusy)
			wait();
		try {
			System.out.println("FINISHED WAITING TO READ FILE faculty.txt");
			FileInputStream fis = new FileInputStream("faculty.txt");
			try (ObjectInputStream input = new ObjectInputStream(fis)) {
				for (int i = 0; i < 5; i++) {
					faculty f = (faculty) input.readObject();
					farr[i] = f;
					if (f.designation.compareTo("Assistant Professor") == 0) {
						f.displayInfo();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			faculty.sortAndDisplayFacultyByNames(farr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
