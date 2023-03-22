package in.Allah;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException {
		
		String bookId = req.getParameter("bookId");
		String bookName = req.getParameter("bookName");
		String bookPrice = req.getParameter("bookPrice");
		
		System.out.println(bookId);
		System.out.println(bookName);
		System.out.println(bookPrice);
		
		PrintWriter pw = res.getWriter();
		
		pw.write("Form Submitted");
	}

}
