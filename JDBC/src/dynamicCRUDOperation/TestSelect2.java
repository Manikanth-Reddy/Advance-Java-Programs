package dynamicCRUDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=Manikanth!4289";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement("Select * from Customer");
			System.out.println(st.execute());
		
			ResultSet res=st.getResultSet();
			if(res.next())	
			System.out.print(res.getInt(1)+"\t");
				System.out.print(res.getString(2)+"\t");
				System.out.print(res.getString(3)+"\t");
				System.out.print(res.getInt(4)+"\t");
				System.out.println(res.getString(5));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
