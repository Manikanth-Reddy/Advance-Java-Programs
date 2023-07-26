package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/customer2")
@SuppressWarnings("serial")
public class ProductDetailsCookie1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.addCookie(new Cookie("gst","18%"));
			Cookie cookie = new Cookie("price","in_INR");
			cookie.setValue("INDOLLOR");
			resp.addCookie(cookie);
			
			resp.sendRedirect("customer3");
		
	}
}
