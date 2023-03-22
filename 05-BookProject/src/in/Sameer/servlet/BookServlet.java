package in.Sameer.servlet;

import java.awt.print.Book;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.Ashish.dao.BookDAO;
import in.mantoo.dto.BookDTO;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String id = req.getParameter("bookId");
			String name = req.getParameter("bookName");
			String price = req.getParameter("bookPrice");
			
			int bookId = Integer.parseInt(id);
			double bookPrice = Double.parseDouble(price);
			
			BookDTO dto = new BookDTO();
			dto.setBookId(bookId);
			dto.setBookName(name);
			dto.setBookPrice(bookPrice);
			
			BookDAO dao = new BookDAO();
			boolean status = dao.saveBook(dto);
			
			String response = null;
			if(status) {
				response = "Record Inserted";
			}else {
				response = "Inserted Failed";
			}
			PrintWriter pw1 = resp.getWriter();
			pw1.append(response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
