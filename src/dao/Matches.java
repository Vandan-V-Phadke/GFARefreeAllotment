package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Match;

public class Matches {
	
	
	public static ArrayList<Match> getMatchesForTournament(String tournament_name){
		ArrayList<Match> matches = new ArrayList<Match>();
		String tour_id = Tournaments.getTournamentId(tournament_name);
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "SELECT * FROM `table_matches` WHERE `tournament_id` = " + tour_id;
			
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String venue_id = rs.getString("match_venue");
				String venue_name = Venues.getVenueNamefromId(venue_id);
				Match match = new Match(Integer.parseInt(rs.getString("match_id")), rs.getString("match_round"), 
						rs.getString("match_type"), rs.getString("match_team_A"), 
						rs.getString("match_team_B"),"", 
						rs.getString("match_fourth_official"), rs.getString("match_commissioner"), 
						rs.getString("match_standby_official"), rs.getString("match_organizer"));
				
				matches.add(match);
			}
			
			return matches;
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
		
		return null; 
	}

	public static boolean addMatchUnderTournament(Match match,
			String tournament_name) {
		
		String tour_id = Tournaments.getTournamentId(tournament_name);
		String venue_id = Venues.getVenueIdfromName(match.getVenue());
		SQLConnection sqlConnection = new SQLConnection();
		PreparedStatement pstmt = null;
		try{
			Connection conn = sqlConnection.getConnection();
			String query = "INSERT INTO `gfa`.`table_matches` (`tournament_id`, "
					+ "`match_type`, `match_round`, `match_team_A`, `match_team_B`, "
					+ "`match_venue`, `match_fourth_official`, `match_commissioner`, "
					+ "`match_standby_official`, `match_organizer`) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, tour_id);
			pstmt.setString(2, match.getMatch_type());
			pstmt.setString(3, match.getRound());
			pstmt.setString(4, match.getTeamA());
			pstmt.setString(5, match.getTeamB());
			pstmt.setString(6, venue_id);
			pstmt.setString(7, match.getFourth_official());
			pstmt.setString(8, match.getMatch_commissioner());
			pstmt.setString(9, match.getStandby_official());
			pstmt.setString(10, match.getMatch_organizer());
			System.out.println(pstmt.toString());
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
}
