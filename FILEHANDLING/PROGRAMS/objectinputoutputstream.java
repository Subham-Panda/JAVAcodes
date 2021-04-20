package FILEHANDLING.PROGRAMS;

import java.io.*;
public class objectinputoutputstream {
	public static void main(String[] args) throws Throwable {
		try {
			student t = new student("Subham", "19BIT0093");
			File obj = new File("test2.txt");

			FileOutputStream fout = new FileOutputStream(obj);
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(t);
			objout.close();

			FileInputStream fin = new FileInputStream(obj);
			ObjectInputStream objin = new ObjectInputStream(fin);
			student s = (student) objin.readObject(); //!typecasting is important
			s.display();
			objin.close();


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class student implements Serializable {
	String name;
	String regno;

	public student(String name, String regno) {
		this.name = name;
		this.regno = regno;
	}

	public void display() {
		System.out.println(name+" "+regno);
	}
}
