<%@page import="dao.Referees"%>
<%@page import="dao.Venues" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<div>
	<h2 class="sub-header">Add new Refree</h2>
   		<form class="form-horizontal" role="form" action="addrefree" method = "POST">
        	<div class="form-group">
            	<label class="control-label col-sm-2">First Name of referee:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "firstname" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Last Name of referee:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "lastname" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Nick Name of referee:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "nickname" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Primary Contact No:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "primarycontact" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Secondary Contact No:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "secondarycontact" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Email Address:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "email" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Village/Town of residence:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "residence" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">GFA Zone:</label>
                <div class="col-sm-10">
                	<select name="zone">
                        <% ArrayList<String> zones = Referees.getAllZones();
                           for(String zone: zones)
                        		out.print("<option value = "+ zone+ ">" + zone + "</option>");
                        %>
                    </select>
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Taluka:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "taluka" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">AIFF RIN ID No:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "idno" >
                </div>
            </div>
            <div class="form-group">
            	<label class="control-label col-sm-2">Class of Referee:</label>
                <div class="col-sm-10">
                	<input type="text" class="form-control" name = "class" >
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">First Preferred Ground:</label>
                <div class="col-sm-10">
                    <select name="firstpref">
                        <% ArrayList<String> venues = Venues.getAllVenueNames();
                           for(String venue: venues)
                        		out.print("<option value = "+ venue+ ">" + venue + "</option>");
                        %>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Second Preferred Ground:</label>
                <div class="col-sm-10">
                    <select name="secondpref">
                        <%	for(String venue: venues)
                        		out.print("<option value = "+ venue+ ">" + venue + "</option>");
                        %>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Third Preferred Ground:</label>
                <div class="col-sm-10">
                    <select name="thirdpref">
                        <%	for(String venue: venues)
                        		out.print("<option value = "+ venue+ ">" + venue + "</option>");
                        %>
                    </select>
                </div>
            </div>
            <div class="form-group"> 
             	<div class="col-sm-offset-2 col-sm-10">
                  	<button type="submit" class="btn btn-default">ADD NEW REFREE</button>
                </div>
            </div>
        </form>
</div>