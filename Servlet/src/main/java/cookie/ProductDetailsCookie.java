package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer1")
@SuppressWarnings("serial")
public class ProductDetailsCookie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String customer = req.getParameter("customer");
		String pro = req.getParameter("pro");
		String type = req.getParameter("type");
		
		resp.addCookie(new Cookie("id", id));
		resp.addCookie(new Cookie("customer", customer));
		resp.addCookie(new Cookie("pro", pro));
		resp.addCookie(new Cookie("type", type));
		resp.sendRedirect("customer2");
		
	}
}
