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
    <h2 class="sub-header">Add a new Match</h2>
        <form class="form-horizontal" role="form" action="addmatch" method = "POST">
            <div class="form-group">
                <label class="control-label col-sm-2">Match Number</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "matchno" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Match Round</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "round" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Match Type</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "type" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Team A:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "teamA" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Team B:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "teamB" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Match Venue</label>
                <div class="col-sm-10">
                	<select name = "match_venue">
                    <% ArrayList<String> venues = Venues.getAllVenueNames();
                       for(String venue: venues)
                        out.print("<option value = "+ venue+ ">" + venue + "</option>");
                     %>
                     </select> 
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Fourth Official</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "fourthoffifcial" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Match Commissioner</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "commissioner" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Standby Official</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "standby" >
                </div>
            </div>
            
            <div class="form-group">
                <label class="control-label col-sm-2">Match Organizer</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name = "organizer" >
                </div>
            </div>
            
            <div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-default">Add New Match</button>
                </div>
            </div>
            
        </form>
        
        <form class="form-horizontal" role="form" action="addrefreetotour" method = "POST">
        	<div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                  <h5>Finish adding matches and start adding referees</h5>
                  <button type="submit" class="btn btn-default">Finish</button>
                </div>
            </div>
        </form>
</div>

<div >
    <% String tournament_name = (String)session.getAttribute("tournament_name");
    out.print("<h1> Tournament Name:" + tournament_name + "</h1>");
    ArrayList<Match> matches = Matches.getMatchesForTournament(tournament_name);
    for(Match match: matches){
        out.print(match.getTeamA() + " vs " + match.getTeamB());
        //out.print("Venue " + match.getVenue());
        out.print("</br>");
    }
    %>
</div>      
      
</div> 
    </body>
</html>