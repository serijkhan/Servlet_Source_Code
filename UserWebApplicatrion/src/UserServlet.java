import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sameer.dao.UserDAO;
import in.sameertech.dto.UserDTO;

@WebServlet("/user")
public class UserServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phno = req.getParameter("phno");
		
		UserDTO user = new UserDTO();
		user.setUserName(name);
		user.setUserEmail(email);
		user.setUserPhno(Integer.parseInt(phno));
		
		UserDAO dao = new UserDAO();
		boolean isSaved = dao.saveUser(user);
		
		String msg = null;
		
		if(isSaved) {
			msg = "User Saved";
	    }else {
		msg = "User Not Saved";
	   }
         
		req.setAttribute("msg", msg);
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
   	}
	
	
	
	
	

}
