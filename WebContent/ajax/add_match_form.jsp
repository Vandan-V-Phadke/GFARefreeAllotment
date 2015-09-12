<%@page import="dao.Venues" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<div>
	<h2 class="sub-header">Add a new Match</h2>
		<form class="form-horizontal" role="form" action="addrefree" method = "POST">
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
            	<label class="control-label col-sm-2">Match Venue</label>
                <div class="col-sm-10">
                	<% ArrayList<String> venues = Venues.getAllVenueNames();
                       for(String venue: venues)
                       	out.print("<option value = "+ venue+ ">" + venue + "</option>");
                     %>
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
            
        </form>
</div>