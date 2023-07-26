package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert2 {
	public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/wakanda";
	Connection connection = DriverManager.getConnection(url,"root","root");
	Statement St = connection.createStatement();
	boolean res = St.execute("INSERT INTO Customer VALUES (2,'MANI','MANIKANTH@GMAIL.COM',23,'BNGLR')");
	System.out.println(res);
} catch (ClassNotFoundException | SQLException e) {
	e.printStackTrace();
}

	}
}
