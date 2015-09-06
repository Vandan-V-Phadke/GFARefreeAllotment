package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.transform.Result;

public class Credentials {
	
	String password = "";
	public static boolean doesUserExist(String username){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT `USER_PASSWORD` FROM `table_users` WHERE `USER_NAME` = '?'";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.wasNull())
				return false;
			else{
				
			}
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		finally{

			try {
				sqlConnection.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public static boolean verifyPassword(){
		return false;
	}
}
