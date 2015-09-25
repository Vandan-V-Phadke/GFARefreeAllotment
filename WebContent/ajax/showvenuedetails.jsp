<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>These are the details of the venue: Click submit if details are correct</title>
</head>
<body>
	<ul>
		<li><p><b>Name of Ground:</b>
   		<%= request.getParameter("groundname")%>
		</p></li>
		
		<li><p><b>Owner Name:</b>
   		<%= request.getParameter("ownername")%>
		</p></li>
		
		<li><p><b>Primary Contact Number:</b>
   		<%= request.getParameter("primaryphone")%>
		</p></li>
		
		<li><p><b>Secondary Contact Number:</b>
   		<%= request.getParameter("secondaryphone")%>
		</p></li>
		
</ul>

</body>
</html>