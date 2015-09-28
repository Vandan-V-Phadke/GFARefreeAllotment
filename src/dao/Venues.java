package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Venue;

public class Venues {
	public static boolean addNewVenue(Venue venue){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "INSERT INTO `gfa`.`table_venues` (`venue_name`, `venue_primary_phone`, "
					+ "`venue_secondary_phone`, `venue_email`, `venue_location`, `venue_gfa_zone`, "
					+ "`venue_taluka`, `venue_organizer`, `venue_owner_name`) VALUES (?, "
					+ "?, ?, ?, ?, ?, ?, ?, ?);";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, venue.getVenue_name());
			pstmt.setString(2, venue.getOwner_primary_phone());
			pstmt.setString(3, venue.getOwner_secondary_phone());
			pstmt.setString(4, venue.getOwner_email());
			pstmt.setString(5, venue.getVenue_location());
			pstmt.setString(6, venue.getVenue_zone());
			pstmt.setString(7, venue.getVenue_taluka());
			pstmt.setString(8, venue.getVenue_oraganizer());
			pstmt.setString(9, venue.getOwner_name());
			
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
	
	public static String getVenueNamefromId(String venue_id){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT `venue_name` FROM `table_venues` WHERE `venue_id` = '" + venue_id + "'";
			
			pstmt = conn.prepareStatement(query);
			System.out.println(pstmt.toString());
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String venue_name = rs.getString("venue_name");
			return venue_name;
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
	
	public static String getVenueIdfromName(String venue_name){
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT `venue_id` FROM `table_venues` WHERE `venue_name` = '" + venue_name + "'";
			
			pstmt = conn.prepareStatement(query);
			System.out.println(pstmt.toString());
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String venue_id = rs.getString("venue_id");
			return venue_id;
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
