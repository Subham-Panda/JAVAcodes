
// fetching records - selct * from students where name='Subham Panda';
import java.sql.*;

public class p6jdbc {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost:3306/vitSubham";
		String USER = "guest";
		String PASS = "guest123";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection established successfully");
			Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = smt.executeQuery("select * from students where name = 'Subham Panda';");
			if (rs.next() == false) {
				System.out.println("No such record found in database");
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
