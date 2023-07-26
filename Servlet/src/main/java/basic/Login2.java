package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/login2")
public class Login2 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email="manikanth11800@gmail.com";
		String pass="Manikanth!4289";
		if(email.equalsIgnoreCase(req.getParameter("email")) && pass.equals(req.getParameter("password"))) {
			res.getWriter().println("🙏🙏🙏 Welcome User 🫂🫂🫂🫂🫂🫂");
		}
		else
			res.getWriter().println("Oho noo Enter Correct Details....");
		res.getWriter().print("do post executed...........");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email="manikanth11800@gmail.com";
		String pass="Manikanth!4289";
		if(email.equalsIgnoreCase(req.getParameter("email")) && pass.equals(req.getParameter("password"))) {
			res.getWriter().println("🙏🙏🙏 Welcome User 🫂🫂🫂🫂🫂🫂");
		}
		else
			res.getWriter().println("Oho noo Enter Correct Details....");
		res.getWriter().print("do get executed...........");
	}


}
