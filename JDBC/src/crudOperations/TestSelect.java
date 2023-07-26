package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=root";
			Connection con = DriverManager.getConnection(url);
			Statement st = con.createStatement();
			st.executeQuery("Select * from Customer");
			ResultSet res=st.getResultSet();
			
			while(res.next()) {
				System.out.print(res.getInt(1)+"\t");
				System.out.print(res.getString(2)+"\t");
				System.out.print(res.getString(3)+"\t");
				System.out.print(res.getInt(4)+"\t");
				System.out.println(res.getString(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
