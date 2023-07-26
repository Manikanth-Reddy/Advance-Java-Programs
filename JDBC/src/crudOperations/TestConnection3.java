package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestConnection3 {

	public static void main(String[] args) {
		try {
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream file=new FileInputStream("DataBase.properties");
//			Reading data from the file
			Properties p=new Properties();
			p.load(file);
//			Accessing data from the data
			DriverManager.getConnection("jdbc:mysql://localhost:3306/wakanda",p);
			System.out.println("Done 😍😍😍");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
