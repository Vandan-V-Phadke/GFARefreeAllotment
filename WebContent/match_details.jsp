<%@page import="dao.Venues" %>
<%@page import="dao.Matches" %>
<%@page import="models.Match" %>
<%@page session="true" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <title>GFA Tournament Planner</title>
        <meta name="generator" content="Bootply" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/styles.css" rel="stylesheet">
    </head>
    <body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Admin Panel</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
          </ul>
          <!--<form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>-->
        </div>
      </div>
</nav>

<div class="container-fluid">
    <div>
    <h2 class="sub-header">Add match with following details ?</h2>
    	<ul>
    		<li><p><b>Tournament Name: </b>
   			<%= request.getParameter("tourname")%>
			</p></li>
    		
			<li><p><b>Match No:</b>
   			<%= request.getParameter("matchno")%>
			</p></li>
			
			<li><p><b>Match Round:</b>
   			<%= request.getParameter("round")%>
			</p></li>
			
			<li><p><b>Match Type:</b>
   			<%= request.getParameter("type")%>
			</p></li>
			
			<li><p><b>Team A:</b>
   			<%= request.getParameter("teamA")%>
			</p></li>
			
			<li><p><b>Team B:</b>
   			<%= request.getParameter("teamB")%>
			</p></li>
			
			<li><p><b>Match Venue:</b>
   			<%= request.getParameter("match_venue")%>
			</p></li>
			
			<li><p><b>Fourth Official:</b>
   			<%= request.getParameter("fourthoffifcial")%>
			</p></li>
			
			<li><p><b>Match Commissioner:</b>
   			<%= request.getParameter("commissioner")%>
			</p></li>
			
			<li><p><b>Standby Official:</b>
   			<%= request.getParameter("standby")%>
			</p></li>
			
			<li><p><b>Match Organizer:</b>
   			<%= request.getParameter("organizer")%>
			</p></li>
		</ul>
		
		<form action="addmatch" method="post">
			<input type="submit" name="addmatch" value="Conform Match" />
		</form>
	</div>
    
      
</div> 
    </body>
</html>