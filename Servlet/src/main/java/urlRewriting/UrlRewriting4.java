package urlRewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rewrite2")
@SuppressWarnings("serial")
public class UrlRewriting4 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		resp.getWriter().println("ID ="+id);
		resp.getWriter().println("Name :"+name);
		resp.getWriter().println("Email :"+email);
	}
}
