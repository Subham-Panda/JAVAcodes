import java.util.*;
import java.io.*;

public class qs11 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		while (true) {
			System.out.println("-----CHOOSE OPTION------");
			System.out.println("1.Submit Project Data");
			System.out.println("2.View Project Data");
			System.out.println("3.EXIT");
			System.out.print("Enetr choice: ");
			int n = sc.nextInt();
			if (n == 1) {
				System.out.print("Enter Project name: ");
				String ProjectName = sc1.nextLine();
				System.out.print("Enter Project ID: ");
				int projectID = sc.nextInt();
				System.out.print("Enter Project budget: ");
				int budget = sc.nextInt();
				System.out.print("Enter Project location: ");
				String location = sc1.nextLine();
				Project p = new Project(ProjectName, projectID, budget, location);
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/project.txt");
				FileOutputStream fout = new FileOutputStream(obj);
				ObjectOutputStream objout = new ObjectOutputStream(fout);
				objout.writeObject(p);
				objout.close();
			} else if (n == 2) {
				File obj = new File("/home/subham/Documents/WINSEM20-21/JAVA LAB/DA4/session 7 - april 29/project.txt");
				FileInputStream fin = new FileInputStream(obj);
				ObjectInputStream objin = new ObjectInputStream(fin);
				Project parr[] = new Project[Project.total];
				for (int i = 0; i < Project.total; i++) {
					parr[i] = (Project) objin.readObject();
					parr[i].displayInfo();
				}
				objin.close();
			} else if (n == 3) {
				sc.close();
				sc1.close();
				System.exit(1);
			} else {
				System.out.println("INVALID CHOICE");
			}
		}
	}
}

class Project implements Serializable {
	String ProjectName;
	int projectID;
	int budget;
	String location;

	static int total = 0;

	Project(String ProjectName, int projectID, int budget, String location) {
		this.ProjectName = ProjectName;
		this.projectID = projectID;
		this.budget = budget;
		this.location = location;
		total++;
	}

	public void displayInfo() {
		System.out.println("Project Name: " + ProjectName + ", Project ID: " + projectID + ", Budget: " + budget
				+ ", Location: " + location);
	}
}