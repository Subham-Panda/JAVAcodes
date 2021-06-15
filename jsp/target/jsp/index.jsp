<%@ page language="java" contentType="text/html" %>
<%@ page import="java.sql.*" %> 
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>WELCOME TO MY LOGIN PAGE</title>
</head>
<body>
	<form action="index.jsp" method="post">
		<label for="selectname">Enter your name</label>
		<input type="text" name="username" required><br/>
		<label for="selectpassword">Enter your password</label>
		<input type="password" name="password" id="selectpassword"><br/>
		<select name="country">
			<option value="India">India</option>
			<option value="US">US</option>
			<option value="UK">UK</option>
		</select><br/>
		<label for="selectmark">Enter your marks</label>
		<input type="text" name="mark" id="selectmark"><br/>
		<input type="submit" name="submit" value="SUBMIT">
	</form>

	<%!
		class student {
			private String username;
			private String password;
			private String country;
			private int mark;

			public student(String username, String password, String country, int mark) {
				this.username = username;
				this.password = password;
				this.country = country;
				this.mark = mark;
			}

			public boolean insertStudentRecord() {
				try {
					dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/vitSubham", "guest", "guest123");
					Connection con = dbmsconnect.getConnection();
					String sql = "insert into students values (?,?,?,?,?);";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1, username);
					stmt.setString(2, password);
					stmt.setString(3, country);
					stmt.setInt(4, mark);
					int i = stmt.executeUpdate();
					dbmsconnect.closeConnection(con, stmt);
					if (i > 0) {
						return true;
					} else {
						return false;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					return false;
				}
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
	%>

	<%
		String sub = request.getParameter("submit");
		if(sub!=null) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String country = request.getParameter("country");
			String mark = request.getParameter("mark");

			try {
				student s = new student(username,password,country,Integer.parseInt(mark));
				boolean result = s.insertStudentRecord();
				if(result) {
					out.println("Record inserted successfully");
				} else {
					out.println("Error inserting record");
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	%>
</body>
</html>
