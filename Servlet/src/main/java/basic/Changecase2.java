package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/case")
@SuppressWarnings("serial")
public class Changecase2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Object name = req.getAttribute("data");
		String email = req.getParameter("email");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<body bgcolor =red>");
		out.println("<h1> Hi="+name+"</h1>");
		out.print("Your Id Number is ="+id);
		out.println("Your Email is "+email);
		out.print("<a href=./Login.html> hi");
		out.print("</body>");
	}
}
