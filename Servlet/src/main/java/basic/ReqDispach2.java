package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reqdis2")
public class ReqDispach2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2nd class doPost () is executed");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Object data = req.getAttribute("data");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<body bgcolor =red>");
		out.println("<h1>"+id+"</h1>");
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+email+"</h1>");
		out.println("<h1>"+data+"</h1>");
		out.print("</body>");
	}
}
