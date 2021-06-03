
// fetching records - selct * from students;
import java.sql.*;

public class p5jdbc {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/vitSubham";
		String USER = "guest";
		String PASS = "guest123";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection established successfully");
			Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = smt.executeQuery("select * from students;");
			if (rs.next() == false) {
				System.out.println("The table is empty");
			} else {
				rs.previous();
				while (rs.next()) {
					System.out.println("Name: "+rs.getString(1)+", Password: "+rs.getString(2)+", Country: "+rs.getString(3)+", Marks: "+rs.getInt(4));
				}
			}
			smt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
