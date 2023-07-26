package responseRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/responseredirect2")
@SuppressWarnings("serial")
public class Response2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<body bgclor=lightblue>");
		out.println("<h1>Your Id ="+id+"</h1>" );
		out.println("<h1>Name"+firstname+" "+lastname+"</h1>" );
		out.println("<h1>Email ="+email+"</h1>" );
		out.println("<h1>Age ="+age+"</h1>" );
		out.println("<h1>Gender ="+gender+"</h1>" );
		out.println("</body>");
		
	}
}
