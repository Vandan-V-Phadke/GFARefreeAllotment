import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Referees;
import models.Referee;


public class AddRefreeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Referee ref = new Referee(req.getParameter("firstname"), req.getParameter("lastname"), 
				req.getParameter("nickname"), req.getParameter("primarycontact"), req.getParameter("secondarycontact"), 
				req.getParameter("email"), req.getParameter("residence"), req.getParameter("zone"), 
				req.getParameter("taluka"), req.getParameter("firstpref"), 
				req.getParameter("secondpref"), req.getParameter("thirdpref"), 
				req.getParameter("idno"), req.getParameter("class"));
		
		Referees.addReferee(ref);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
