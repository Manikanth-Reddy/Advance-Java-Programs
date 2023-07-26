package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class Save extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("HAI MAWA!!!!");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		res.setContentType("text/html");
		// this method is used to modify the content type of the response
//		by default content type is text
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		PrintWriter writer = res.getWriter();
		writer.write("<body bgcolor=lightgreen");
		writer.println("<h1>"+id+"</h1>");
		writer.println("<h1>"+name+"</h1>");
		writer.println("<h1>"+email+"</h1>");
		writer.println("<h1>"+age+"</h1>");
		writer.write("</body>");
	}

}
