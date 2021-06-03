// updating record
import java.sql.*;

public class p3jdbc {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/vitSubham";
		String USER = "guest";
		String PASS = "guest123";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection established successfully");
			Statement smt = con.createStatement();
			smt.executeUpdate("update students set password='testpass1' where name='Tommy';");
			System.out.println("Record updated successfully");
			smt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
