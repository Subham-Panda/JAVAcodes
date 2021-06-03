// Connecting to database
import java.sql.*;

public class p1jdbc {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/vitSubham";
		String USER = "guest";
		String PASS = "guest123";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection established successfully");
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
