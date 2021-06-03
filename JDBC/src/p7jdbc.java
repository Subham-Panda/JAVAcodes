// Getting details of student from user and Inserting record
import java.sql.*;
import java.util.Scanner;

public class p7jdbc {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/vitSubham";
		String USER = "guest";
		String PASS = "guest123";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection established successfully");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter name of student: ");
			String name = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			System.out.print("Enter country name: ");
			String country = sc.nextLine();
			System.out.print("Enter marks: ");
			int marks = sc.nextInt();
			String sql = "insert into students values (?,?,?,?);";
			PreparedStatement smt = con.prepareStatement(sql);
			smt.setString(1, name);
			smt.setString(2, password);
			smt.setString(3, country);
			smt.setInt(4, marks);
			smt.execute();
			System.out.println("Record inserted successfully");
			smt.close();
			con.close();
			sc.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
