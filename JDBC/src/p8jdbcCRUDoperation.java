
// Getting details of student from user and Inserting record
import java.sql.*;
import java.util.Scanner;

public class p8jdbcCRUDoperation {
	public static void main(String[] args) {

		try {
			int choice;
			Scanner sc = new Scanner(System.in);
			student s = new student();
			do {
				System.out.println("Select an option \n1-Registration \n2-Update Password \n3-Delete Record \n4-Search a Record \n5-Exit");
				choice = sc.nextInt();
				switch (choice) {
					case 1:
						s.getStudentDetails();
						s.insertStudent();
						break;
					case 2:
						s.updateStudentPassword();
						break;
					case 3:
						s.deleteStudentRecord();
						break;
					case 4:
						s.searchStudentRecord();
						break;
					case 5:
						System.out.println("Exiting the Application");
						break;
					default:
						System.out.println("Please select a valid option");
				}
			} while (choice != 5);
			
			System.out.println("Thanks for Using our Software");
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

class student {
	private String name;
	private String password;
	private String country;
	private int mark;

	public void getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of student: ");
		name = sc.nextLine();
		System.out.print("Enter password: ");
		password = sc.nextLine();
		System.out.print("Enter country name: ");
		country = sc.nextLine();
		System.out.print("Enter marks: ");
		mark = sc.nextInt();
		sc.close();
	}

	public void insertStudent() throws SQLException {
		dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
		Connection con = dbmsconnect.getConnection();
		String sql = "insert into students values (?,?,?,?);";
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, name);
		smt.setString(2, password);
		smt.setString(3, country);
		smt.setInt(4, mark);
		smt.execute();
		System.out.println("Record inserted successfully");
		dbmsconnect.closeConnection(con, smt);
	}

	public void updateStudentPassword() throws SQLException {
		dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
		Connection con = dbmsconnect.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String inputname = sc.nextLine();
		System.out.print("Enter your new Password: ");
		String inputpass = sc.nextLine();
		String sql = "update students set passwrd = ? where name = ?;";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, inputpass);
		stmt.setString(2, inputname);
		int i = stmt.executeUpdate();
		if (i > 0) {
			System.out.println("Record Upated Successfully");
		} else {
			System.out.println("No such record found in the Database");
		}
		dbmsconnect.closeConnection(con, stmt);
		sc.close();
	}

	public void deleteStudentRecord() throws SQLException {
		dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
		Connection con = dbmsconnect.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name to delete the record: ");
		String inputname = sc.nextLine();
		String sql = "delete from students where name = ?;";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, inputname);
		int i = stmt.executeUpdate();
		if (i > 0) {
			System.out.println("Record Deleted Successfully");
		} else {
			System.out.println("No such record found in the Database");
		}
		dbmsconnect.closeConnection(con, stmt);
		sc.close();
	}

	public void searchStudentRecord() throws SQLException {
		dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
		Connection con = dbmsconnect.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name to search: ");
		String inputname = sc.nextLine();
		String sql = "select * from students where name = ?;";
		PreparedStatement stmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		stmt.setString(1, inputname);
		ResultSet rs = stmt.executeQuery();
		if (rs.next() == false) {
			System.out.println("There is no such record in the database");
		} else {
			rs.previous();
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}
		dbmsconnect.closeConnection(con, stmt);
		sc.close();
	}
}

class dbmsconnection {
	String url;
	String username;
	String password;

	public dbmsconnection(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established successfully");
		return con;
	}

	public void closeConnection(Connection con, Statement stmt) throws SQLException {
		stmt.close();
		con.close();
		System.out.println("The connection is closed");
	}
}
