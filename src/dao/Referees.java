package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Referee;

public class Referees {
	
	static SQLConnection sqlConnection;
	
	public static boolean addReferee(Referee ref){
		sqlConnection = new SQLConnection();
		
		try{
			int first_pref_id = getGrouundIdFromName(ref.getRefree_first_preference());
			int second_pref_id = getGrouundIdFromName(ref.getRefree_first_preference());
			int third_pref_id = getGrouundIdFromName(ref.getRefree_first_preference());
			int zone = getZoneIdFromName(ref.getRefree_gfa_zone());
			
			Connection conn = sqlConnection.getConnection();
			PreparedStatement pstmt = null;
			String query = "INSERT INTO `table_refree`(`refree_first_name`, `refree_last_name`, "
					+ "`refree_nick_name`, `refree_primary_phone`, `refree_secondary_phone`, "
					+ "`refree_email`, `refree_residence`, `refree_zone`, `refree_taluka`, `refree_pref_1`,"
					+ " `refree_pref_2`, `refree_pref_3`, `refree_aiff_rin_id`, `refree_class`) VALUES "
					+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ref.getRefree_first_name());
			pstmt.setString(2, ref.getRefree_last_name());
			pstmt.setString(3, ref.getRefree_nick_name());
			pstmt.setString(4, ref.getRefree_primary_contact());
			pstmt.setString(5, ref.getRefree_secondary_contact());
			pstmt.setString(6, ref.getRefree_email_address());
			pstmt.setString(7, ref.getRefree_residence());
			pstmt.setInt(8, zone);
			pstmt.setString(9, ref.getRefree_taluka());
			pstmt.setInt(10, first_pref_id);
			pstmt.setInt(11, second_pref_id);
			pstmt.setInt(12, third_pref_id);
			pstmt.setString(13, ref.getRefree_aiff_rin_id());
			pstmt.setString(14, ref.getRefree_class());
			
			boolean done = pstmt.execute();
			return done; 
		}catch(SQLException | ClassNotFoundException e){e.printStackTrace();}
		finally{
			try {
				sqlConnection.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false; 
	}
	
	
	private static int getGrouundIdFromName(String ground_name) throws SQLException, ClassNotFoundException{
		int id = 0 ; 
		PreparedStatement pstmt = null;
		String query = "SELECT `venue_id` FROM `table_venues` WHERE venue_name = ?";
		Connection conn = sqlConnection.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, ground_name);
		ResultSet rs = pstmt.executeQuery();
		rs.first();
		id = Integer.parseInt(rs.getString("venue_id"));
		return id;
	}
	
	private static int getZoneIdFromName(String zone_name) throws SQLException, ClassNotFoundException{
		int id = 0 ; 
		PreparedStatement pstmt = null;
		String query = "SELECT `zone_id` FROM `table_zones` WHERE zone_name = ?";
		Connection conn = sqlConnection.getConnection();
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, zone_name);
		ResultSet rs = pstmt.executeQuery();
		rs.first();
		id = Integer.parseInt(rs.getString("zone_id"));
		conn.close();
		return id;
	}
	
	public static ArrayList<String> getAllZones(){
		ArrayList<String> zones = new ArrayList<String>();
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			String query = "SELECT zone_name from table_zones";
			Connection conn = sqlConnection.getConnection();
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				zones.add(rs.getString("zone_name"));
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
		return zones;
		
	}
}
