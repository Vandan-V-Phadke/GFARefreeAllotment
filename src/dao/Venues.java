package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Venue;

public class Venues {
	public static void addNewVenue(Venue venue){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "INSERT INTO `gfa`.`table_venues` (`venue_name`, `venue_primary_phone`, "
					+ "`venue_secondary_phone`, `venue_email`, `venue_location`, `venue_gfa_zone`, "
					+ "`venue_taluka`, `venue_organizer`, `venue_owner_name`) VALUES ('?', "
					+ "'?', '?', '?', '?', '?', '?', '?', '?');";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, venue.getVenue_name());
			pstmt.setString(2, venue.getOwner_primary_phone());
			pstmt.setString(3, venue.getOwner_secondary_phone());
			pstmt.setString(4, venue.getOwner_email());
			pstmt.setString(5, venue.getVenue_location());
			pstmt.setString(6, venue.getVenue_zone());
			pstmt.setString(7, venue.getVenue_taluka());
			pstmt.setString(8, venue.getVenue_oraganizer());
			pstmt.setString(8, venue.getOwner_name());
			
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
	}
	
	public static ArrayList<String> getAllVenueNames(){
		ArrayList<String> venue_names = new ArrayList<String>();
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			String query = "SELECT venue_name from table_venues";
			Connection conn = sqlConnection.getConnection();
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				venue_names.add(rs.getString("venue_name"));
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
		
		return venue_names;
	}
}
