import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Credentials;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Credentials newUser = new Credentials(username, password);
		
		if(newUser.validateUser() == 1){
			//This is admin login for staff
			System.out.println("Admin Login");
			response.sendRedirect("admin.html");
		}
		else if(newUser.validateUser() == 2){
			//This is refree admin login
			
		}
		else if(newUser.validateUser() == 3){
			//This is document login admin
		}
		else{
			//incorrect parameters
			//Redirect to error page
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(req, response);
	}
}
