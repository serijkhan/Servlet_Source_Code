package in.sameer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("msg");
	
		PrintWriter writer = resp.getWriter();
		writer.append("Welcome to first servlet");
	
	
	
	}
	
	

}
