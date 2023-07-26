package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/register")
public class SaveStudent extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String id_Number = req.getParameter("id-Number");
		int id1 =Integer.parseInt(id);
		Student student = new Student();
		student.setId(id1);
		student.setName(name);
		student.setEmail(email);
		student.setIdcard(id_Number);
		StudentDao.saveStudent(student);
		PrintWriter out = res.getWriter();
		Student st = StudentDao.getStudentById(id1);
		out.write("<body bgcolor=lightgreen");
		out.println("<h2>Hello -"+st.getName()+"</h2>");
		out.println("<h2>Thanks for Registation</h1>");
		out.println("<h2>Please very Your details</h1>");
		out.println("<h1>"+st.getEmail()+"</h1>");
		out.println("<h1>"+st.getIdcard()+"</h1>");
		out.write("</body>");
	}

}
