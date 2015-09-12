import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Venues;
import models.Venue;


public class AddVenueServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Venue venue = new Venue(req.getParameter("groundname"), req.getParameter("ownername"), 
				req.getParameter("primaryphone"), req.getParameter("secondaryphone"), 
				req.getParameter("owneremail"), req.getParameter("location"), req.getParameter("zone"), 
				req.getParameter("taluka"), req.getParameter("organizer"));
		
		Venues.addNewVenue(venue);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
