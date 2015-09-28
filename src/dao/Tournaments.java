package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tournaments {

	public static boolean addNewTournament(String name, String type,
			String start_date, String end_date) {
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "INSERT INTO `table_tournament` (`tournament_name`,`tournament_type`, `tournament_start_date`, `tournament_end_date`) VALUES (?, ?, ?, ?);";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, type);
			pstmt.setString(3, start_date);
			pstmt.setString(4, end_date);
			
			boolean done = pstmt.execute();
			return done; 
			
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
	
	public static String getTournamentId(String tournament_name){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT `tournament_id` FROM `table_tournament` WHERE `tournament_name` = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tournament_name);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String tournament_id = rs.getString("tournament_id");
			return tournament_id;
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
		return "";
	}

}
