package in.sameertech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {
		PrintWriter pw = response.getWriter();
		
		pw.append("<h1>Good Evening...</h1>");
	}

}
