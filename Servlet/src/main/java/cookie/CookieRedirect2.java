package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieredirect2")
@SuppressWarnings("serial")
public class CookieRedirect2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
//		Cookie cookie = cookies[0];
//		Cookie cookie1 = cookies[1];
//		Cookie cookie2 = cookies[2];
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("id"))
				resp.getWriter().println("Id =" + cookie.getValue());
			else if (cookie.getName().equals("name"))
				resp.getWriter().println("Name =" + cookie.getValue());
			else if (cookie.getName().equals("email"))
				resp.getWriter().println("Email =" + cookie.getValue());
		}

//		resp.getWriter().println(cookie.getValue());
//		resp.getWriter().println(cookie1.getValue());
//		resp.getWriter().println(cookie2.getValue());

	}
}
