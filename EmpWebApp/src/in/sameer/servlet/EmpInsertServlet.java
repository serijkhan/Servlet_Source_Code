package in.sameer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sameer.DAO.EmpDAO;
import in.sameertech.DTO.EmpDTO;

@WebServlet("/insert")
public class EmpInsertServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String dept = req.getParameter("dept");
		String exp = req.getParameter("exp");
		
		EmpDTO dto =new EmpDTO();
		dto.setEmpDept(dept);
		dto.setEmpEmail(email);
		dto.setEmpName(name);
		dto.setEmpGender(gender);
		dto.setEmpExp(Integer.parseInt(exp));
		//saving
		EmpDAO dao = new EmpDAO();
		boolean isSaved = dao.saveEmp(dto);
		
		String msg = null;
		
		if(isSaved) {
			msg = "Saved successfully";
		}else {
			msg = "Failed to Save";
		}
		
		//send msg to jsp page
		req.setAttribute("msg", msg);
		
		//redirect request to same jsp page
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
		
  }

}
