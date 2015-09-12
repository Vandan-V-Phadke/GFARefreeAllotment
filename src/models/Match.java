package models;

public class Match {
	int match_no;
	String round;
	String match_type;
	String teamA;
	String teamB;
	String venue;
	String main_referee;
	String first_assistant_referee;
	String second_assistant_referee;
	String fourth_official;
	String match_commissioner;
	String standby_official; 
	String match_organizer;
	
	public Match(int match_no, String round, String match_type, String teamA,
			String teamB, String venue, String main_referee,
			String first_assistant_referee, String second_assistant_referee,
			String fourth_official, String match_commissioner,
			String standby_official, String match_organizer) {
		this.match_no = match_no;
		this.round = round;
		this.match_type = match_type;
		this.teamA = teamA;
		this.teamB = teamB;
		this.venue = venue;
		this.main_referee = main_referee;
		this.first_assistant_referee = first_assistant_referee;
		this.second_assistant_referee = second_assistant_referee;
		this.fourth_official = fourth_official;
		this.match_commissioner = match_commissioner;
		this.standby_official = standby_official;
		this.match_organizer = match_organizer;
	}

	public int getMatch_no() {
		return match_no;
	}

	public void setMatch_no(int match_no) {
		this.match_no = match_no;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getMatch_type() {
		return match_type;
	}

	public void setMatch_type(String match_type) {
		this.match_type = match_type;
	}

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getMain_referee() {
		return main_referee;
	}

	public void setMain_referee(String main_referee) {
		this.main_referee = main_referee;
	}

	public String getFirst_assistant_referee() {
		return first_assistant_referee;
	}

	public void setFirst_assistant_referee(String first_assistant_referee) {
		this.first_assistant_referee = first_assistant_referee;
	}

	public String getSecond_assistant_referee() {
		return second_assistant_referee;
	}

	public void setSecond_assistant_referee(String second_assistant_referee) {
		this.second_assistant_referee = second_assistant_referee;
	}

	public String getFourth_official() {
		return fourth_official;
	}

	public void setFourth_official(String fourth_official) {
		this.fourth_official = fourth_official;
	}

	public String getMatch_commissioner() {
		return match_commissioner;
	}

	public void setMatch_commissioner(String match_commissioner) {
		this.match_commissioner = match_commissioner;
	}

	public String getStandby_official() {
		return standby_official;
	}

	public void setStandby_official(String standby_official) {
		this.standby_official = standby_official;
	}

	public String getMatch_organizer() {
		return match_organizer;
	}

	public void setMatch_organizer(String match_organizer) {
		this.match_organizer = match_organizer;
	}
	
	
}
