package basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login3")
@SuppressWarnings("serial")
public class TestLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email="manikanth11800@gmail.com";
		String pass="Manikanth!4289";
		if(email.equalsIgnoreCase(req.getParameter("email")) && pass.equals(req.getParameter("password"))) {
			RequestDispatcher r = req.getRequestDispatcher("home");
			r.forward(req, res);
		}
		else {
			RequestDispatcher in = req.getRequestDispatcher("invalid");
			in.forward(req, res);
		}
	}
}
