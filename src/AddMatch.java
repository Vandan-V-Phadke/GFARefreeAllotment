import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Matches;
import models.Match;


public class AddMatch extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Match match = new Match(1, req.getParameter("round"), req.getParameter("type"), 
				req.getParameter("teamA"), req.getParameter("teamB"), req.getParameter("match_venue"),
				req.getParameter("fourthoffifcial"), req.getParameter("commissioner"),
				req.getParameter("standby"), req.getParameter("organizer")
				);
		
		String tournament_name = (String)req.getSession().getAttribute("tournament_name");
		
		Matches.addMatchUnderTournament(match, tournament_name);
		resp.sendRedirect("add_matches.jsp");
	}
}
