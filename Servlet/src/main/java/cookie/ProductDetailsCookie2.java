package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customer3")
@SuppressWarnings("serial")
public class ProductDetailsCookie2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		for (Cookie a : cookies) {
			if (a.getName().equalsIgnoreCase("id"))
				out.println("Id =" + a.getValue());
			if (a.getName().equalsIgnoreCase("customer"))
				out.println("customer =" + a.getValue());
			if (a.getName().equalsIgnoreCase("pro"))
				out.println("Product  =" + a.getValue());
			if (a.getName().equalsIgnoreCase("type"))
				out.println("Type =" + a.getValue());
			if (a.getName().equalsIgnoreCase("gst"))
				out.println("Gst =" + a.getValue());
			if (a.getName().equalsIgnoreCase("price"))
				out.println("Price =" + a.getValue());

		}
	}
}
