package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=root";
			Connection con = DriverManager.getConnection(url);
			Statement st = con.createStatement();
			boolean res = st.execute("INSERT INTO Customer VALUES (3,'reddy','reddy@gmail.com',24,'Kadiri')");
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
