package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/wakanda";
			Connection connection = DriverManager.getConnection(url, "root", "root");
			Statement statement = connection.createStatement();
			String query ="INSERT INTO customer(id, name, email, age, address) VALUES (1,'Mani Reddy','********1@gamil.com',23,'Hybd')";
			boolean execute = statement.execute(query);
			System.out.println(execute);
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
