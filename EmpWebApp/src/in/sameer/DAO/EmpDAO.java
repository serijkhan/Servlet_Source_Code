package in.sameer.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sameertech.ConnectionFactory;
import in.sameertech.DTO.EmpDTO;

public class EmpDAO {
	
	private static final String INSERT="insert into emp_dtls(EMP_NAME,EMP_GENDER,EMP_DEPT,EMP_EMAIL,EMP_EXP) values(?,?,?,?,?)";
     
	public boolean saveEmp(EmpDTO empDto) {
		int count = 0;
		try {
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement pstmt = con.prepareStatement(INSERT);
			pstmt.setString(1, empDto.getEmpName());
			pstmt.setString(2, empDto.getEmpEmail());
			pstmt.setString(3, empDto.getEmpGender());
			pstmt.setString(4, empDto.getEmpDept());
			pstmt.setInt(5, empDto.getEmpExp());
		   count = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	     return count > 0;
	}
}
