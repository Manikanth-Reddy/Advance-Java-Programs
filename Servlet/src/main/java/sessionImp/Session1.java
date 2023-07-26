package sessionImp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/session1")
@SuppressWarnings("serial")
public class Session1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		HttpSession session = req.getSession();
		session.setAttribute("id", id);
		session.setAttribute("name",name);
		session.setAttribute("email", email);
//		resp.sendRedirect("session2");
		resp.sendRedirect("display.jsp");
		
	}
}
