<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

  if(session.getAttribute("username") == null){
	  
	  response.sendRedirect("login.jsp");
  }

 
   
%>
         Welcome $(username)
         <a href="website.jsp">Website</a>
         
         <form action="Logout">
         <input type="submit" name="Logout">
         </form>
    

 
</body>
</html>