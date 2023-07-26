package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=root";
			Connection con = DriverManager.getConnection(url);
			Statement st = con.createStatement();
			boolean res = st.execute("UPDATE Customer SET name='Ravan Reddy' where id=2");
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
