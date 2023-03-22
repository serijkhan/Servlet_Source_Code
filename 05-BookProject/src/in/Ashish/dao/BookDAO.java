package in.Ashish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.Ashish.util.ConnectionFactory;
import in.mantoo.dto.BookDTO;

public class BookDAO {
	
	private static final String INSERT_SQL ="insert into books values(?,?,?)";
	
	public boolean saveBook(BookDTO dto)throws Exception{
		
		 Connection con = ConnectionFactory.getConnection();	
		
		PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, dto.getBookId());
		pstmt.setString(2, dto.getBookName());
		pstmt.setDouble(3, dto.getBookPrice());
		
		int count = pstmt.executeUpdate();
     	 con.close();
     	 return count > 0;
	}
}
