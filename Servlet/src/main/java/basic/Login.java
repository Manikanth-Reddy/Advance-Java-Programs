package basic;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/login")
public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email="manikanth11800@gmail.com";
		String pass="Manikanth!4289";
		if(email.equalsIgnoreCase(req.getParameter("email")) && pass.equals(req.getParameter("password"))) {
			res.getWriter().println("🙏🙏🙏 Welcome User 🫂🫂🫂🫂🫂🫂");
		System.out.println("🙏🙏🙏 Welcome User 🫂🫂🫂🫂🫂🫂");
		}
		else
			res.getWriter().println("Oho noo Enter Correct Details....");
	}

}
