package in.sameer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.sameertech.ConnectionFactory;
import in.sameertech.dto.UserDTO;

public class UserDAO {
	
	private static final String INSERT_SQL="insert into user_dtls(user_name,user_email,user_phno) values (?,?,?)";
	
	private static final String SELECT_SQL="SELECT * FROM USER_DTLS";
	
	public boolean saveUser(UserDTO userdto) {
		boolean isSaved = false;
		try {
		      Connection con = ConnectionFactory.getConnection();
		      PreparedStatement pstmt = con.prepareStatement("INSERT_SQL");
		      
		      pstmt.setString(1, userdto.getUserEmail());
		      pstmt.setString(2, userdto.getUserName());
		      pstmt.setInt(3, userdto.getUserPhno());
		      
		      int cnt = pstmt.executeUpdate();
		      if(cnt > 0) {
		    	  isSaved = true;
		      }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSaved;
	}

     public List<UserDTO> getUsers(){
    	 List<UserDTO> users = new ArrayList<UserDTO>(); 
     
    	 try {
    		 Connection con = ConnectionFactory.getConnection();
    		 Statement stmt = con.createStatement();
    		 ResultSet rs = stmt.executeQuery(SELECT_SQL);
    		 
    		 while(rs.next()) {
    			 UserDTO user = new UserDTO();
    			 
    			 user.setUserId(rs.getInt("USER_ID"));
    			 user.setUserName(rs.getString("USER_NAME"));
    			 user.setUserEmail(rs.getString("USER_EMAIL"));
    			 user.setUserPhno(rs.getInt("USER_PHNO"));
    			 
    			 users.add(user);
    		 }
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 return users;
     }
}























