package in.serij.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter pw = res.getWriter();
		pw.append("This is first servlet response");
		
		RequestDispatcher rd = req.getRequestDispatcher("/second");
		//rd.forward(req, res);
		rd.include(req, res);
	}
	

}
