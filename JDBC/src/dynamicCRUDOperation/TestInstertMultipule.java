package dynamicCRUDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInstertMultipule {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=Manikanth!4289";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement("INSERT INTO customer values(?,?,?,?,?) ");
			st.setInt(1, 5);
			st.setString(2,"reddy");
			st.setString(3, "van@gmail.com");
			st.setInt(4, 23);
			st.setString(5, "KADIRI");
			st.addBatch();
			st.setInt(1, 6);
			st.setString(2, "Kanth reddy");
			st.setString(3, "kanth@gamil.com");
			st.setInt(4, 24);
			st.setString(5, "BNGLR");
			st.addBatch();
			System.out.println(st.executeBatch().length);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
