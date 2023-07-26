package sessionImp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session2")
@SuppressWarnings("serial")
public class Session2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id = (String)session.getAttribute("id");
		String name = (String)session.getAttribute("name");
		String email = (String)session.getAttribute("email");
		PrintWriter out = resp.getWriter();
		out.println("Id ="+id);
		out.println("Name ="+name);
		out.println("Email ="+email);
		session.removeAttribute("id");
		session.removeAttribute("name");
		session.removeAttribute("email");
		System.out.println(session.getAttribute("id"));
	
	}
}
