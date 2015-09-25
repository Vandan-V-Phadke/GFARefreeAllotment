package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		return false;
		
	}

}
