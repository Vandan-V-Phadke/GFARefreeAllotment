<%@page import="dao.Venues" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<h2 class="sub-header">Add a new Tournament</h2>
<form class="form-horizontal" role="form" action="newtournament" method = "POST">
	<div class="form-group">
		<label class="control-label col-sm-2">Name of Tournament:</label>
        	<div class="col-sm-10">
            	<input type="text" class="form-control" name = "tour_name" >
            </div>
     </div>
     
     <div class="form-group">
	 	<label class="control-label col-sm-2">Type of Tournament:</label>
        	<div class="col-sm-10">
            	<select name = "tour_type">
               		<option value="league">League</option>
                	<option value="knockout">Knock Out</option>
                	<option value="series">Series</option>
                </select>
            </div>
     </div>
     
     <div class="form-group">
		<label class="control-label col-sm-2">Tournament Start date:</label>
        	<div class="col-sm-10">
            	<input type="date" class="form-control" name = "tour_start_date" >
            </div>
     </div>
     
     <div class="form-group">
		<label class="control-label col-sm-2">Tournament End date:</label>
        	<div class="col-sm-10">
            	<input type="date" class="form-control" name = "tour_end_date" >
            </div>
     </div>
     
     <div class="form-group"> 
     	<div class="col-sm-offset-2 col-sm-10">
        	<button type="submit" class="btn btn-default">START NEW TOURNAMENT</button>
        </div>
     </div>
            
</form>