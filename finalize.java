import java.sql.*;

public class finalize {
	public static void main (String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://alldbs.c9q0z7esjprb.us-east-1.rds.amazonaws.com:3306/upgrad", //connection string
					"upgrad", //user name
					"upgrad" //password
					);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM MANAGER");
			while (rs.next()) {
				System.out.println(rs.getString("username") + " : " + rs.getString("password"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
