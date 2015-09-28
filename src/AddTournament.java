import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Tournaments;


public class AddTournament extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name = req.getParameter("tour_name");
		String type = req.getParameter("tour_type");
		String start_date = req.getParameter("tour_start_date");
		String end_date = req.getParameter("tour_end_date");
		
		
		boolean status = Tournaments.addNewTournament(name, type, start_date, end_date);
		//Redirect to adding matches page
		HttpSession session = req.getSession();
		session.setAttribute("tournament_name",name);
		resp.sendRedirect("add_matches.jsp");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
