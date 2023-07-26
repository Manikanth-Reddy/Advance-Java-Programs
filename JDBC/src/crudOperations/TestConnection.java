package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/manikanth", "root",
					"root");
			System.out.println("Done 👍👍👍");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
