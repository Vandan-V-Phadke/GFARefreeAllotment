package models;

public class Venue {
	String venue_name;
	String owner_name;
	String owner_primary_phone;
	String owner_secondary_phone;
	String owner_email;
	String venue_location;
	String venue_zone;
	String venue_taluka;
	String venue_oraganizer;
	
	public Venue(String venue_name, String owner_name,
			String owner_primary_phone, String owner_secondary_phone,
			String owner_email, String venue_location, String venue_zone,
			String venue_taluka, String venue_oraganizer) {
		this.venue_name = venue_name;
		this.owner_name = owner_name;
		this.owner_primary_phone = owner_primary_phone;
		this.owner_secondary_phone = owner_secondary_phone;
		this.owner_email = owner_email;
		this.venue_location = venue_location;
		this.venue_zone = venue_zone;
		this.venue_taluka = venue_taluka;
		this.venue_oraganizer = venue_oraganizer;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getOwner_primary_phone() {
		return owner_primary_phone;
	}

	public void setOwner_primary_phone(String owner_primary_phone) {
		this.owner_primary_phone = owner_primary_phone;
	}

	public String getOwner_secondary_phone() {
		return owner_secondary_phone;
	}

	public void setOwner_secondary_phone(String owner_secondary_phone) {
		this.owner_secondary_phone = owner_secondary_phone;
	}

	public String getOwner_email() {
		return owner_email;
	}

	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}

	public String getVenue_location() {
		return venue_location;
	}

	public void setVenue_location(String venue_location) {
		this.venue_location = venue_location;
	}

	public String getVenue_zone() {
		return venue_zone;
	}

	public void setVenue_zone(String venue_zone) {
		this.venue_zone = venue_zone;
	}

	public String getVenue_taluka() {
		return venue_taluka;
	}

	public void setVenue_taluka(String venue_taluka) {
		this.venue_taluka = venue_taluka;
	}

	public String getVenue_oraganizer() {
		return venue_oraganizer;
	}

	public void setVenue_oraganizer(String venue_oraganizer) {
		this.venue_oraganizer = venue_oraganizer;
	}
	
	
}
