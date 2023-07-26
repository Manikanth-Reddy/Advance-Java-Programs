package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	public static void saveStudent(Student s) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=Manikanth!4289";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement st = con.prepareStatement("INSERT INTO student values(?,?,?,?) ");
			st.setInt(1, s.getId());
			st.setString(2,s.getName());
			st.setString(3, s.getEmail());
			st.setString(4, s.getIdcard());
			System.out.println(st.executeUpdate());
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static Student getStudentById(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/wakanda?user=root &password=Manikanth!4289";
			Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement("SELECT * FROM student where id=?");
			ps.setInt(1, id);
			ps.execute();
			ResultSet resultSet = ps.getResultSet();
			Student student = new Student();
			if(resultSet.next()) {
				student.setId(resultSet.getInt(1));
				student.setName(resultSet.getString(2));
				student.setEmail(resultSet.getString(3));
				student.setIdcard(resultSet.getString(4));
			}
			con.close();
			return student;
			
		} catch (ClassNotFoundException | SQLException e) {
		}
		return null;
	}
}
