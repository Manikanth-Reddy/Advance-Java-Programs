package sessionImp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/session1")
public class Jsp extends HttpServlet {
	@SuppressWarnings("rawtypes")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		List<Integer> li=new ArrayList<Integer>();
		li.add(15);
		li.add(8);
		li.add(5);
		li.add(25);
		HttpSession session = req.getSession();
		session.setAttribute("list", li);
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("email", email);
		resp.sendRedirect("display.jsp");
	}
}
