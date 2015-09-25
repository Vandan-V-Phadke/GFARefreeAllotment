package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Credentials {
	
	String username, password;
	
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public int validateUser(){
		System.out.println(username + "  " + password);
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT `USER_PASSWORD`, `USER_PRIVILEGE` FROM `table_users` WHERE `USER_NAME` = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			System.out.println(query);
			ResultSet rs = pstmt.executeQuery();
			if(rs.wasNull())
				return -1;
			else{
				String passStr = "";
				rs.next();
				passStr = rs.getString("USER_PASSWORD");
				if(passStr.equals(password.trim())){
					return Integer.parseInt(rs.getString("USER_PRIVILEGE"));
				}
				else{
					return -1; 
				}
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
		return -1;
	}
	
}
