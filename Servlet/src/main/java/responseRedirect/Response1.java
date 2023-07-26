package responseRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseredirect1")
@SuppressWarnings("serial")
public class Response1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname );
		System.out.println(email);
		System.out.println(age);
		System.out.println(gender);
		resp.sendRedirect("responseredirect2");
		
	}
}
